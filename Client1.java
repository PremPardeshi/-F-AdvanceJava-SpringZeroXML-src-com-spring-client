package com.spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.Productconfig;
import com.spring.model.Product;

public class Client1 {

	public static void main(String[] args) {
		
		ApplicationContext context= new AnnotationConfigApplicationContext(Productconfig.class);
		 
		Product p1=(Product) context.getBean("id1");
		System.out.println("hashcode"+p1.hashCode());
		System.out.println(p1);
		System.out.println("******************************************************");
		
		Product p2=(Product) context.getBean("id1");
		System.out.println("hashcode"+p2.hashCode());
		System.out.println(p1);
		System.out.println("******************************************************");
		
		Product p3=(Product) context.getBean("id2");
		System.out.println("hashcode"+p3.hashCode());
		System.out.println(p3);
		System.out.println("******************************************************");
		
		Product p4=(Product) context.getBean("id2");
		System.out.println("hashcode"+p4.hashCode());
		System.out.println(p4);
		System.out.println("******************************************************");
		

	}

}
