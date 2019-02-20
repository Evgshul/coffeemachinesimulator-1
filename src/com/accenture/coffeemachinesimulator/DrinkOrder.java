package com.accenture.coffeemachinesimulator;

public class DrinkOrder implements CoffeeMachine{
    private Drink drinkType;
    private String name;
    private double money;
    private int sugar;

    public DrinkOrder(Drink drinkType, String name, double money, int sugar) {
        this.drinkType = drinkType;
        this.name = name;
        this.money = money;
        this.sugar = sugar;
    }

    @Override
    public Drink make(DrinkOrder drinkOrder) {
        return null;
    }

    @Override
    public boolean validateOrder(String validate) {
        return false;
    }

    @Override
    public String inStock(String ingredients) {
        return null;
    }

    @Override
    public boolean isBusy() throws InterruptedException {
        return false;
    }
}
