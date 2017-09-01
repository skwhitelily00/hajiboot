package com.example.hajiboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 2.1.5章から不要
 *
 */
@Component
public class Fronted {
	@Autowired
	ArgumentResolver argumentResolver;
	
	@Autowired
	Calculator calculator;
	
	public void run() {
		System.out.print("Enter 2 numbers like 'a b' : ");
		Argument argument = argumentResolver.resolve(System.in);
		int result = calculator.calc(argument.getA(), argument.getB());
		System.out.println("Result = " + result);
	}
}
