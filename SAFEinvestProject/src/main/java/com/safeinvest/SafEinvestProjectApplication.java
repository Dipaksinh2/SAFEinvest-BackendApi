package com.safeinvest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.safeinvest.empDAO.EmpRepositoryImpl;


@SpringBootApplication
public class SafEinvestProjectApplication implements CommandLineRunner{

	@Autowired
	private EmpRepositoryImpl emprepo;
	
	public static void main(String[] args) {
		SpringApplication.run(SafEinvestProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(emprepo.createTable());		
	}

}
