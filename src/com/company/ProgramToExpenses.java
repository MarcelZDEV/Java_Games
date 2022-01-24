package com.company;

import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ProgramToExpenses {
    static void Wait(int wait) {
        try {
            TimeUnit.SECONDS.sleep(wait);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        HashMap<String, Integer> YourExpenses = new HashMap<String, Integer>();
        int TotalExpenses = 0;
        System.out.println("-----------Welcome in Program to your Expense's-----------");
        System.out.println("-----------1 Menu-----------");
        System.out.println("-----------2 Quit-----------");
        String MenuUser = Scan.nextLine();
        while (true) {
            if (MenuUser.equals("1")) {
                System.out.println("-----------Menu-----------");
                System.out.println("-----------1 Add Expenses-----------");
                System.out.println("-----------2 Show Expenses-----------");
                System.out.println("-----------3 Clear All Expenses-----------");
                System.out.println("-----------4 Delete Expenses-----------");
                System.out.println("-----------5 Quit-----------");
                String MenuUserExpenses = Scan.nextLine();
                if (MenuUserExpenses.equals("1")) {
                    System.out.println("Type here your expense name");
                    String ExpenseAddName = Scan.nextLine();
                    System.out.println("Type here your expense");
                    int ExpenseAddCost = Integer.parseInt(Scan.nextLine());
                    if (ExpenseAddCost % 1 == 0) {
                        YourExpenses.put(ExpenseAddName, ExpenseAddCost);
                        System.out.println("Your expense is added");
                        TotalExpenses = TotalExpenses + ExpenseAddCost;
                    }else {
                        System.out.println("Value must have only numbers");
                    }
                    Scan.nextLine();
                } else if (MenuUserExpenses.equals("2")) {
                    System.out.println("Your total expenses: " + TotalExpenses);
                    for (String i : YourExpenses.keySet()) {
                        System.out.println(i + " " + YourExpenses.get(i) + " ZŁ");
                    }
                    Scan.nextLine();
                } else if (MenuUserExpenses.equals("3")) {
                    YourExpenses.clear();
                    System.out.println("Your expenses list is null");
                    TotalExpenses = 0;
                    Scan.nextLine();
                } else if (MenuUserExpenses.equals("4")) {
                    for (String i : YourExpenses.keySet()) {
                        System.out.println(i + " " + YourExpenses.get(i) + " ZŁ");
                    }
                    System.out.println("Which expense you want delete");
                    String DeleteExpense = Scan.nextLine();
                    boolean Exist = YourExpenses.containsKey(DeleteExpense);
                    if (Exist) {
                        int Result = YourExpenses.get(DeleteExpense);
                        TotalExpenses = TotalExpenses - Result;
                        YourExpenses.remove(DeleteExpense);
                        System.out.println("Your expenses list");
                        System.out.println(TotalExpenses);
                        for (String i : YourExpenses.keySet()) {
                            System.out.println(i + " " + YourExpenses.get(i) + " ZŁ");
                        }
                    } else {
                        System.out.println("I don't find this expense");
                    }
                    Scan.nextLine();
                } else if (MenuUserExpenses.equals("5")) {
                    break;
                }
            } else if (MenuUser.equals("2")) {
                break;
            }
        }
    }
}
