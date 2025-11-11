package com.spring.gestione_pagamento;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PaypalProcessor implements PaymentProcessor{

	@Override
	public void processPayment(double amount) {
		
		System.out.println("Pagamento con PayPal: €" + amount);
		
		
	}
	
	
}
