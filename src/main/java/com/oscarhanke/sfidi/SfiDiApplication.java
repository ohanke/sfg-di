package com.oscarhanke.sfidi;

import com.oscarhanke.sfidi.controllers.ConstructorInjectedController;
import com.oscarhanke.sfidi.controllers.I18nController;
import com.oscarhanke.sfidi.controllers.MyController;
import com.oscarhanke.sfidi.controllers.PetController;
import com.oscarhanke.sfidi.controllers.PropertyInjectedController;
import com.oscarhanke.sfidi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//@ComponentScan(basePackages = {"com.oscarhanke.sfidi", "com.springframework.pets"})
@SpringBootApplication
public class SfiDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(SfiDiApplication.class, args);

		PetController petController = ctx.getBean("petController", PetController.class);
		System.out.println("--- The Best Pet is ---");
		System.out.println(petController.whichPetIsTheBest());

		I18nController i18nController = (I18nController) ctx.getBean("i18nController") ;
		System.out.println(i18nController.sayHello());

		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println(myController.sayHello());

		System.out.println(" --------- property");
		PropertyInjectedController propertyInjectedController =
				(PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println(" -------- setter ");
		SetterInjectedController setterInjectedController =
				(SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println(" -------- constructor");
		ConstructorInjectedController constructorInjectedController =
				(ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
