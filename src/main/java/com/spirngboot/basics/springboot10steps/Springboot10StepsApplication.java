package com.spirngboot.basics.springboot10steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
/**
 * 
 * @author 91783
 * spring boot looks at the frameworks avail at the claspath and also beans/existing config for the application , based on these spring boot provides
 * basic config needed to configure the application with these frameworks.
 * SpringBootApplication annotation indicates that it is spring context file.
 * It enable auto config
 * It enable component scan (i.e automation scan of this class package and sub packages"
 */
@SpringBootApplication
public class Springboot10StepsApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(Springboot10StepsApplication.class, args);
		
		for(String name:applicationContext.getBeanDefinitionNames()) {
			System.out.println("***********************************");
			System.out.println(name);
			System.out.println("***********************************");
		}
	}

}
