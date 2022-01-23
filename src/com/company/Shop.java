package com.company;

import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.*;

public class Shop {
    static void Wait(int wait) {
        try {
            TimeUnit.SECONDS.sleep(wait);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        int TotalCost = 0;
        String[] CartString = {};
        Scanner Scan = new Scanner(System.in);
        HashMap<String, Integer> Products = new HashMap<String, Integer>();
        ArrayList<String> Cart = new ArrayList<String>(Arrays.asList(CartString));
        Products.put("Kofola", 3);
        Products.put("Pepsi", 5);
        Products.put("Lays onion", 5);
        Products.put("Milk", 4);
        Products.put("Cheerios", 6);
        Products.put("Butter", 2);
        System.out.println("*-*-*-*-*-*-*-Welcome In Shop*-*-*-*-*-*-*-");
        Wait(2);
        while (true) {
            System.out.println("*-*-*-*-*-*-*-1 Add To Cart-*-*-*-*-*-*-*-");
            Wait(1);
            System.out.println("*-*-*-*-*-*-*-2 Clear Cart-*-*-*-*-*-*-*-");
            Wait(1);
            System.out.println("*-*-*-*-*-*-*-3 Quit*-*-*-*-*-*-*-");
            String ChoseOption = Scan.nextLine();
            if (ChoseOption.equals("1")) {
                for (String i : Products.keySet()) {
                    System.out.println(i + " " + Products.get(i) + " ZŁ");
                }
                System.out.println("Type Which Products You Want Buy");
                String Buy = Scan.nextLine();
                boolean exist = Products.containsKey(Buy);
                if (exist) {
                    int cost = Products.get(Buy);
                    TotalCost = TotalCost + cost;
                    Cart.add(Buy);
                    System.out.println("Total cost is: " + TotalCost + " ZŁ");
                    for (String str : Cart) {
                        System.out.println(str + ",");
                    }
                } else {
                    System.out.println("Product don't exist or some thing gone wrong");
                }
            } else if (ChoseOption.equals("2")) {
                TotalCost = 0;
                Cart.clear();
                System.out.println("Your Cart Is Cleared");
            } else if (ChoseOption.equals("3")) break;
            else break;
        }
    }
}
