package com.example.S5.l1.config;


import com.example.S5.l1.model.Drink;
import com.example.S5.l1.model.Menu;
import com.example.S5.l1.model.Pizza;
import com.example.S5.l1.model.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class PizzaConfig {




    @Bean
    public Pizza margheritaPizza() {
        Pizza margherita = new Pizza();
        margherita.setName("Pizza Margherita");
        margherita.setIngredients(Arrays.asList("tomato", "cheese"));
        margherita.setCalories(1104);
        margherita.setPrice(4.99);
        return margherita;


    }
    @Bean
    public Pizza hawaiianPizza() {
        Pizza hawaiian = new Pizza();
        hawaiian.setName("Hawaiian Pizza");
        hawaiian.setIngredients(Arrays.asList("tomato", "cheese", "ham", "pineapple"));
        hawaiian.setCalories(1160);
        hawaiian.setPrice(6.49);
        return hawaiian;
    }

    @Bean
    public Pizza salamiPizza() {
        Pizza salami = new Pizza();
        salami.setName("Salami Pizza");
        salami.setIngredients(Arrays.asList("tomato", "cheese", "salami"));
        salami.setCalories(1024);
        salami.setPrice(5.99);
        return salami;
    }
    @Bean
    public Menu menu(List<Pizza> pizzas, List<Topping> toppings, List<Drink> drinks) {
        // Crea e restituisci un'istanza di Menu con le liste di pizze, toppings e drinks
        Menu menu = new Menu();
        menu.setPizzas(pizzas);
        menu.setToppings(toppings);
        menu.setDrinks(drinks);
        return menu;
    }


}
