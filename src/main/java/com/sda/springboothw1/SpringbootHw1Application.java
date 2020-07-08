package com.sda.springboothw1;

import com.sda.springboothw1.model.Purchase;
import com.sda.springboothw1.service.PurchaseServiceImplementation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootHw1Application {

	private static final Logger log = LoggerFactory.getLogger(SpringbootHw1Application.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHw1Application.class, args);
	}

	@Bean
	public CommandLineRunner demo(PurchaseServiceImplementation service) {
		return (args) -> {
			// save a few purchases
			service.save(new Purchase("Car", 5000L));
			service.save(new Purchase("Bike", 120L));
			service.save(new Purchase("Toy", 10L));
			service.save(new Purchase("Hat", 30L));
			service.save(new Purchase("Plane", 2500000L));

			// fetch all purchases
			log.info("Purchases found with findAll():");
			log.info("-------------------------------");
			for (Purchase purchase : service.findAll()) {
				log.info(purchase.toString());
			}
			log.info("");

			// fetch customers by item name
			log.info("Purchase found with findByItem('Toy'):");
			log.info("--------------------------------------------");
			log.info(service.findByItem("Toy").toString());
			log.info("");

			// fetch all expensive purchases
			log.info("Expensive Purchases found with findAllExpensive():");
			log.info("-------------------------------");
			for (Purchase purchase : service.findAllExpensive()) {
				log.info(purchase.toString());
			}
			log.info("");
		};
	}

}
