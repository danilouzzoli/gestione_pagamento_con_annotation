package com.spring.gestione_pagamento;

import java.applet.AppletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class GestionePagamentoApplication  implements CommandLineRunner{
	
	@Autowired
	//CheckoutService cs;
	ApplicationContext ac;
	
	
	public static void main(String[] args) {
		SpringApplication.run(GestionePagamentoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//cs.checkout(  1000  );
		
		//PaypalProcessor pp = ac.getBean(PaypalProcessor.class);
		CheckoutService cs = ac.getBean("pippo", CheckoutService.class);
		
		cs.checkout(  10000 );
		
		
	}

	

}
