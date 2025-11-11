package com.spring.gestione_pagamento;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
public class CreditCardProcessor implements PaymentProcessor{
	
	private String numberCard;
	
	
	@Override
	public void processPayment(double amount) {
		
		System.out.println("Pagamento con carta di credito: €" + amount);
		
	}

}
