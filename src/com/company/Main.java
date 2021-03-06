package com.company;

public class Main {

    public static void main(String[] args) {

        OrderingSystem inventory = new OrderingSystem();

        inventory.executeOrder("AlienWare laptop", 2500);
        inventory.executeOrder("SkullCandy HeadPhones", 150);
        inventory.executeOrder("Playstation 5", 500);
        inventory.executeOrder("SkullCandy HeadPhones", 130);
        inventory.executeOrder("AlienWare laptop", 3000);
        inventory.executeOrder("Playstation 5", 600);

        inventory.process();

        System.out.println(inventory.getTotalProducts());
    }
}
