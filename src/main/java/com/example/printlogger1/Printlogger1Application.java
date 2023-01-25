package com.example.printlogger1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Printlogger1Application {

	public static void main(String[] args) {
		SpringApplication.run(Printlogger1Application.class, args);

		try {

			while (true) {
				System.out.println("printing log");

				Thread.sleep(10000);
			}
		} catch (Exception e) {
			System.out.println("error in app");
		}
	}

}
