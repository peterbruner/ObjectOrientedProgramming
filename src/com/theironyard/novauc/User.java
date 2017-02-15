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
    String name;
    int quantity;

    public void menu() {
        while (loopdioop == 1) {
            //ToDo: fix issue of looping extra time
            System.out.println("What would you like to do? add / list / exit");
            switch (input.nextLine()) {

                case "add":
                    //System.out.println("menu option add");
                    createItem();
                    break;

                case "list":
                    //System.out.println("menu option list");
                    showItems();
                    break;

                default:
                    return;
            }
        }
    }

    public void createItem() {
        //no loop necessary for adding. mess up an entry? just live with it!!!!!
        System.out.println("What is the category of the item? bakery / deli / butcher / produce / dairy");
        categoryUser = input.nextLine();
        switch (categoryUser) {
            case "bakery":
                name = findName();
                quantity = findQuantity();
                tracker.add(new Bakery(name, quantity, categoryUser));
                break;
            case "deli":
                name = findName();
                quantity = findQuantity();
                tracker.add(new Deli(name, quantity, categoryUser));
                break;
            case "butcher":
                name = findName();
                quantity = findQuantity();
                tracker.add(new Butcher(name,quantity, categoryUser));
                break;
            case "produce":
                name = findName();
                quantity = findQuantity();
                tracker.add(new Produce(name, quantity, categoryUser));
                break;
            case "dairy":
                name = findName();
                quantity = findQuantity();
                tracker.add(new Dairy(name, quantity, categoryUser));
                break;
            default:
                System.out.println("Ending");
        }
    }

    public String findName() {
        System.out.println("What is the name of the item?");
        nameUser = input.nextLine();
        return nameUser;
    }

    public int findQuantity() {
        System.out.println("Enter the quantity of the item in whole number digits");
        quantityUser = inputNumbers.nextInt();
        return quantityUser;
    }

    public String showItems() {
        for (int i = 0; i < tracker.size(); i++) {
            System.out.println(tracker.get(i).toString());
        }

        return null;
    }
}

