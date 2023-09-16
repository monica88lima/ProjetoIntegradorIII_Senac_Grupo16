package com.example.projetosenac;

import org.hibernate.Hibernate;
import org.hibernate.SessionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.hibernate.Session;
import org.springframework.data.jpa.provider.HibernateUtils;

@SpringBootApplication
public class ProjetosenacApplication {

	public static void main(String[] args) {

		SpringApplication.run(ProjetosenacApplication.class, args);
	}

}
