package com.accenture.coffeemachinesimulator;

import java.util.ArrayList;
import java.util.List;
//    Print out what I can order
//    Cappucciono
//    Black coffee
//    Late, etc
//
//    also show prices of each
//    let me enter number or name of coffee type
//    also let me put money, how much I want to stick in
//    for example coffee costs 0,50 and I have only  1 euro,
//    so in the end coffee machine will bring me out coffee + 0,50
public class Main {

    public static final String COFFEE = "coffee";
    public static final String HOT_WATER = "hot water";
    public static final String MILK = "milk";



    public static void main(String[] args) {

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

        List<DrinkType> drinkTypes = new ArrayList<>();
        drinkTypes.add(new DrinkType("Black Coffee", 0.50, blackCoffeeRecipe));
        drinkTypes.add(new DrinkType("Cappuccino", 1.00, cappuccino));
        drinkTypes.add(new DrinkType("Latte", 1.00, latte));

        System.out.println("Choose coffee type:");


        DrinkOrder order = new DrinkOrder();
    }

    private static
}
