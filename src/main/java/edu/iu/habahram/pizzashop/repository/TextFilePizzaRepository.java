package edu.iu.habahram.pizzashop.repository;

import edu.iu.habahram.pizzashop.model.*;
import org.springframework.stereotype.Repository;

@Repository
public class TextFilePizzaRepository implements PizzaRepository{
    @Override
    public String prepareTheOrderNewYork(OrderData orderData) {
        PizzaStore pizzaStore = null;
        if(orderData.store().equalsIgnoreCase("New York")) {
            pizzaStore = new NewYorkPizzaStore();
        }
        Pizza pizza = pizzaStore.orderPizza(orderData.item());
        return pizza.toString();
    }
    public String prepareTheOrderChicago(OrderData orderData) {
        PizzaStore pizzaStore = null;
        if(orderData.store().equalsIgnoreCase("Chicago")) {
            pizzaStore = new ChicagoPizzaStore();
        }
        Pizza pizza = pizzaStore.orderPizza(orderData.item());
        return pizza.toString();
    }
}
