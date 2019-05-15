package com.company;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class OrderingSystem {

    private final OrderFactory orderFactory = new OrderFactory();
    private final List<Order> orders = new CopyOnWriteArrayList<Order>();

    void executeOrder(String productName, int orderNumber) {
        Product product = orderFactory.lookup(productName);
        Order order = new Order(orderNumber, product);
        orders.add(order);
    }

    void process() {
        for (Order order : orders) {
            order.processOrder();
            orders.remove(order);
        }
    }

    int getTotalProducts() {
        return orderFactory.totalProductsMade();
    }
}
