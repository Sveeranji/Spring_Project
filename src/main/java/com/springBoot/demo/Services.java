package com.springBoot.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "Services")
public class Services {
	@Autowired
	private Repository Repo;
	

	public EntityDemo insertEntity(EntityDemo entity) {
		return Repo.save(entity);
		
	}

	public EntityDemo readEntity(EntityDemo entity) {
		Optional<EntityDemo> optional = Repo.findById(entity.getId());
		if (optional.isPresent())
			return optional.get();
		else
			return null;
	}

	public EntityDemo updateEntity(Integer id,String name,String email) {
		Optional<EntityDemo> optional = Repo.findById(id);
		if (optional.isPresent()) {
			EntityDemo dm = optional.get();
			dm.setName(name);
			dm.setEmail(email);
			Repo.save(dm);
			return dm;
		} else
			throw new RuntimeException("no entity found with id " + id);
	}

	public void deleteEntity(Integer id) {

		Optional<EntityDemo> dm = Repo.findById(id);
		
		Repo.deleteById(id);
		System.out.println(id+" is deleted successfully");
	}

	public List<EntityDemo> readAllEntities() {
		Iterable<EntityDemo> itr = Repo.findAll();
		List<EntityDemo> l = new ArrayList<EntityDemo>();
		for (EntityDemo i : itr) {
			l.add(i);
		}
		return l;
	}

	public List<EntityDemo> readAll(List<Integer> id) {

		Iterable<EntityDemo> itr = Repo.findAllById(id);
		List<EntityDemo> l = new ArrayList<EntityDemo>();
		for (EntityDemo i : itr) {
			l.add(i);
		}
		return l;

	}
	public void deleteAll() {
		Repo.deleteAll();
		System.out.println("deleted all Data");
	}

}
