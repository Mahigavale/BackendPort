package com.portfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class PortfolioApplication {

	public static void main(String[] args) {
		
		
		
		 //Dotenv dotenv = Dotenv.load();
	//	Dotenv dotenv = Dotenv.configure().directory("C:\\Users\\lenovo\\Downloads\\Portfolio (2)\\Portfolio").load();
       // Dotenv dotenv = Dotenv.configure().directory("C:\\Users\\lenovo\\Downloads\\Portfolio (2)\\Portfolio").load();

		//Dotenv dotenv = Dotenv.configure().directory("src/main/resources/chane2").load();

		
      //  Dotenv dotenv = Dotenv.configure().load();
		
     
		
//		Dotenv dotenv = Dotenv.configure().filename("chane2.env").load();
//
//
//		
//		
//		System.out.println("loaded sucessfully !");
//		    System.setProperty("DB_HOST", dotenv.get("DB_HOST"));
//		    System.setProperty("DB_PORT", dotenv.get("DB_PORT"));
//		    System.setProperty("DB_NAME", dotenv.get("DB_NAME"));
//		    System.setProperty("DB_USER", dotenv.get("DB_USER"));
//		    System.setProperty("DB_PASSWORD", dotenv.get("DB_PASSWORD"));
//		    System.setProperty("MAIL_HOST", dotenv.get("MAIL_HOST"));
//		    System.setProperty("MAIL_PORT", dotenv.get("MAIL_PORT"));
//		    System.setProperty("MAIL_USERNAME", dotenv.get("MAIL_USERNAME"));
//		    System.setProperty("MAIL_PASSWORD", dotenv.get("MAIL_PASSWORD"));
//
//		    System.out.println("Database Host: " + dotenv.get("DB_HOST"));

		
		
		SpringApplication.run(PortfolioApplication.class, args);
	}

}
