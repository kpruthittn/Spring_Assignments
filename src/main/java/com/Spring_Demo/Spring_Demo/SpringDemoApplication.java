package com.Spring_Demo.Spring_Demo;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.function.Supplier;
import java.util.logging.Logger;

@SpringBootApplication
public class SpringDemoApplication {
	public static void main(String[] args) {


		/*
		SpringApplication.run(SpringDemoApplication.class, args);
		Question1
		System.out.println("Hello world!");
		        Calculator calculator = new Calculator();
		        int result = calculator.add(5, 3);
		        System.out.println("The sum of the numbers is: "+result);
		 ---------------------------------------------------------------------------
		Question2
				Addition addition= new Addition();
				Calculator calculator = new Calculator(addition);
				int result = calculator.perform(5,8);
				System.out.println("The sum of the numbers is =" + result);


				Subtraction sub = new Subtraction();
				Calculator calculator1 = new Calculator(sub);
				int result1 = calculator1.perform(10 , 2);
				System.out.println("The difference of two numbers is:" + result1);
		*/

		//------------------------------------------------------------------------
		//Question3
//
//		Calculator calculator = new Calculator(new Addition());
//		int result = calculator.perform(5,8);
//		System.out.println("The sum of the numbers is =" + result);
//
//		Calculator calculator1 = new Calculator(new Subtraction());
//		int result1 = calculator1.perform(10,5);
//		System.out.println("The diff of the numbers is =" + result1);

		ApplicationContext applicationContext=SpringApplication.run(SpringDemoApplication.class, args);
		Calculator calculator=applicationContext.getBean(Calculator.class);
		int sol=calculator.perform(1,2);
		System.out.println(sol);



	}

}
