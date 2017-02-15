package com.theironyard.novauc;

import java.util.ArrayList;

/**
 * Created by peter on 2/14/17.
 */
public class InventoryItem {

    public static User user = new User();

    String name;
    int quantity;
    String category;


    InventoryItem(String name, int quantity, String category){
        this.name = name;
        this.quantity = quantity;
        this.category = category;
    }

    @Override
    public String toString() {
        return this.name + " " + this.category + " " + this.quantity;

        //this.name, this.quantity, this.category;
    }
}
