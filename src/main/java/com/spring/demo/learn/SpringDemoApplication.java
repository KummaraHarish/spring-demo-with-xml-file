package com.spring.demo.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
//		Car ca = new Car();
//		ca.drive();
//		Bike b= new Bike();
//		b.drive();
//		Vehical obj = new Bike();
//		obj.drive();
	
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//		Vehical obj = (Vehical) context.getBean("car");
//		obj.drive();
//		Tyre t = (Tyre) context.getBean("tyre");
//		System.out.println(t);
		
		Car obj = (Car) context.getBean("car");
		obj.drive();
		
		SpringApplication.run(SpringDemoApplication.class, args);
	}

}
