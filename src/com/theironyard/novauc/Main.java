package com.theironyard.novauc;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static User user = new User();

    public static void main(String[] args) {
        String name;
        int quantity;
        String category;


        user.menu();
        user.createItem();

    }
}
