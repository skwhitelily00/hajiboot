package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import com.example.hajiboot.Argument;
import com.example.hajiboot.ArgumentResolver;
import com.example.hajiboot.Calculator;
import com.example.hajiboot.Fronted;

//@EnableAutoConfiguration
// @Import(Appconfig.class) //定義クラスを用いる場合
//@ComponentScan				// 自動的に配下のパッケージを走査してDIインジェクションしてくれる

@SpringBootApplication
public class HajibootDiApplication implements CommandLineRunner{
	
	@Autowired
	ArgumentResolver argumentResolver;
	
	@Autowired
	Calculator calculator;
	
	@Override
	public void run(String... arg0) throws Exception {
		System.out.print("Enter 2 numbers like 'a b' : ");
		Argument argument = argumentResolver.resolve(System.in);
		int result = calculator.calc(argument.getA(), argument.getB());
		System.out.println("Result = " + result);
		
	}

	public static void main(String[] args) {
		//ApplicationContext context = SpringApplication.run(HajibootDiApplication.class, args);
		//Fronted fronted = context.getBean(Fronted.class);
		//fronted.run();
		SpringApplication.run(HajibootDiApplication.class, args);
	}


}
