package com.spirngboot.basics.springboot10steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * 
 * @author 91783
 * SpringBootApplication annotation indicates that it is spring context file.
 * It enable auto config
 * It enable component scan
 */
@SpringBootApplication
public class Springboot10StepsApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot10StepsApplication.class, args);
	}

}
