package com.scope.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;





@Configuration
public class UseEmployee  implements CommandLineRunner {

	@Autowired
	ApplicationContext ac;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Employee e1 = ac.getBean(Employee.class);
		e1.setName("Aijay");
		System.out.println(e1);
		Employee e2 = ac.getBean(Employee.class);
		e2.setName("kamal");
		System.out.println(e2);
		Employee e3 = ac.getBean(Employee.class);
		e3.setName("Vijay");
		System.out.println(e3);
		
		
	}
	
	
	
	@Bean
	//@Scope("prototype")
	 Employee get() {
		return new Employee();
	}

}
