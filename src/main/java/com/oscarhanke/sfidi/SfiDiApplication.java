package com.oscarhanke.sfidi;

import com.oscarhanke.sfidi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfiDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(SfiDiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();
		System.out.println(greeting);
	}

}
