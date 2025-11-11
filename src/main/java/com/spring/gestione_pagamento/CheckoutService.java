package com.spring.gestione_pagamento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component( "pippo" )
public class CheckoutService {
	
	private PaymentProcessor paymentProcessor;
	
	// Dependency injection
	@Autowired
	public CheckoutService( PaymentProcessor paymentProcessor) {
		this.paymentProcessor = paymentProcessor;
	}
	
	
	public void checkout(double amount) {
		paymentProcessor.processPayment(amount);
    }
	
	
	
	
	
	
}
