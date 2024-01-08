package com.example.S5.l1;

import com.example.S5.l1.config.PizzaConfig;
import com.example.S5.l1.model.Drink;
import com.example.S5.l1.model.Menu;
import com.example.S5.l1.model.Pizza;
import com.example.S5.l1.model.Topping;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Application {


	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(PizzaConfig.class);

		Menu menu = context.getBean(Menu.class);

		// Stampa a video il contenuto del menu
		System.out.println("Menu:");
		System.out.println("Pizzas:");
		for (Pizza pizza : menu.getPizzas()) {
			System.out.println(pizza.getName() + "\tCalories: " + pizza.getCalories() + "\tPrice: " + pizza.getPrice());
		}

		System.out.println("\nToppings:");
		for (Topping topping : menu.getToppings()) {
			System.out.println(topping.getName() + "\tCalories: " + topping.getCalories() + "\tPrice: " + topping.getPrice());
		}

		System.out.println("\nDrinks:");
		for (Drink drink : menu.getDrinks()) {
			System.out.println(drink.getName() + "\tCalories: " + drink.getCalories() + "\tPrice: " + drink.getPrice());
		}
	}
}