package edu.iu.habahram.pizzashop.repository;

import edu.iu.habahram.pizzashop.model.OrderData;

public interface PizzaRepository {
    String prepareTheOrderNewYork(OrderData orderData);
    String prepareTheOrderChicago(OrderData orderData);
}
