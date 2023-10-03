package com.springBoot.demo;



import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext con=SpringApplication.run(SpringProjectApplication.class, args);
		
//		EntityDemo dm=new EntityDemo(no,name,emilId);
//		EntityDemo dm=new EntityDemo();
//		Scanner sc =new Scanner(System.in);
//		Integer no=sc.nextInt();
//		String name=sc.next();
//		String emilId=sc.next();
//		
//		
//		
//		dm.getName();
//		dm.getId();
//		dm.getEmail();
		
		EntityDemo dm = new EntityDemo(4, "ravi","ravi.marolix@gmail.com");
		Services s = con.getBean(Services.class);
		 System.out.println(s.insertEntity(dm));
//		 System.out.println(s.readEntity(dm));
//		 System.out.println(s.updateEntity(4,"johny"," john.marolix@gmail.com"));
//		 s.deleteEntity(4);
//		System.out.println(s.readAllEntities());
		
		
//		s.deleteAll();
	}

}
