package com.accenture.coffeemachinesimulator;

import java.util.ArrayList;
import java.util.List;

public class DrinkOrder implements CoffeeMachine{


    public static final String COFFEE = "coffee";
    public static final String HOT_WATER = "hot water";
    public static final String MILK = "milk";


    private Drink drinkType;
    private String name;
    private double money;
    private int sugar;

    List<DrinkType> drinkTypes;

    public DrinkOrder() {
        List<String> blackCoffeeRecipe = new ArrayList<>();
        blackCoffeeRecipe.add(COFFEE);
        blackCoffeeRecipe.add(HOT_WATER);

        List<String> cappuccino = new ArrayList<>();
        cappuccino.add(COFFEE);
        cappuccino.add(HOT_WATER);
        cappuccino.add(MILK);

        List<String> latte = new ArrayList<>();
        latte.add(COFFEE);
        latte.add(HOT_WATER);
        latte.add(MILK);
        drinkTypes = new ArrayList<>();
        drinkTypes.add(new DrinkType("Black Coffee", 0.50, blackCoffeeRecipe));
        drinkTypes.add(new DrinkType("Cappuccino", 1.00, cappuccino));
        drinkTypes.add(new DrinkType("Latte", 1.00, latte));
    }

    public DrinkOrder(Drink drinkType, String name, double money, int sugar) {
        this.drinkType = drinkType;
        this.name = name;
        this.money = money;
        this.sugar = sugar;

    }

    @Override
    public Drink make(DrinkOrder drinkOrder) {
        System.out.println("Your " + drinkOrder.getName());

        return drinkOrder.getDrinkType();
    }

    @Override
    public boolean validateOrder(DrinkOrder order) {
        for (DrinkType type : drinkTypes) {
            if(type.equals(order.getName())) {
                return true;
            }
        }
        System.out.println("Sorry, no coffee for you.");
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

    public Drink getDrinkType() {
        return drinkType;
    }

    public String getName() {
        return name;
    }
}
