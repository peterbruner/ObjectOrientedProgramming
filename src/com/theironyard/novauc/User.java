package com.theironyard.novauc;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by peter on 2/14/17.
 */
public class User {

    public static ArrayList<InventoryItem> tracker = new ArrayList<>();
    public static Scanner input = new Scanner(System.in);
    public static Scanner inputNumbers = new Scanner(System.in);

    public String nameUser;
    int quantityUser;
    String categoryUser;
    int loopdioop = 1;

    public void menu() {
        while (loopdioop == 1) {
            System.out.println("What would you like to do? add / show / exit");
            switch (input.nextLine()) {

                case "add" :
                    //System.out.println("menu option add");
                    createItem();
                    break;

                case "show" :
                    System.out.println("menu option show");
                    //show();
                    break;

                default:
                    return;
            }
        }
    }

    public void createItem() {
        //no loop necessary for adding. mess up an entry? just live with it!!!!!
        System.out.println("What is the category of the item? bakery / deli / butcher / produce / dairy");
        String name = input();
        switch (input.nextLine()) {
            case "bakery" :
                new Bakery(name, 0);
                break;
            case "deli" :
                new Deli(name, 0);
                break;
            case "butcher" :
                break;
            case "produce" :
                break;
            case "dairy" :
                break;
            default:
                System.out.println("no mas");
        }

        System.out.println("What is the name of the item?");
        nameUser = input.nextLine();
        System.out.println("Enter the quantity of the item in whole number digits");
        quantityUser = inputNumbers.nextInt();
        System.out.printf("%s %s %s", categoryUser, nameUser, quantityUser);
        //InventoryItem(name, quantity, category);
        this.nameUser = nameUser;
        this.quantityUser = quantityUser;
        this.categoryUser = categoryUser;

        //which constructor(s) to put in the below statement? loop on the category to pick constructor == category?

        //tracker.add(new Bakery(name, quantity, category));
    }
}
