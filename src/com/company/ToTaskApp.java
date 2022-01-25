package com.company;

import java.util.*;

public class ToTaskApp {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        HashMap<String, String> ToDoList = new HashMap<String, String>();
        int TotalList = 0;
        System.out.println("==========Welcome In ToDo App==========");
        while (true) {
            System.out.println("==========Menu==========");
            System.out.println("========1 Add ToDo==========");
            System.out.println("========2 Show All List==========");
            System.out.println("========3 Remove From List==========");
            System.out.println("========4 Clean All List==========");
            System.out.println("========5 Quit==========");
            String MenuChose = Scan.nextLine();
            if (MenuChose.equals("1")) {
                System.out.println("What is Name Of Your Task");
                String NameTask = Scan.nextLine();
                if (NameTask.isEmpty()) {
                    System.out.println("Name can't be empty");
                }
                System.out.println("Add Description To Your Task");
                String Description = Scan.nextLine();
                if (Description.isEmpty()) {
                    System.out.println("Description can't be empty");
                } else {
                    ToDoList.put(NameTask, Description);
                    TotalList = TotalList + 1;
                    System.out.println("Task Is Added");
                    System.out.println("Actual Task In List: " + TotalList);
                }
                Scan.nextLine();
            } else if (MenuChose.equals("2")) {
                for (String i : ToDoList.keySet()) {
                    System.out.println("Your Task List");
                    System.out.println(i + " " + ToDoList.get(i));
                }
                Scan.nextLine();
            } else if (MenuChose.equals("3")) {
                for (String i : ToDoList.keySet()) {
                    System.out.println("Your To Do List: \n" + ToDoList.get(i));
                }
                System.out.println("Which One You Want Delete");
                String DeleteTask = Scan.nextLine();
                boolean Exist = ToDoList.containsKey(DeleteTask);
                if (Exist) {
                    ToDoList.remove(DeleteTask);
                    TotalList = TotalList - 1;
                } else {
                    System.out.println("Task Not Exist");
                }
                System.out.println("Task Is Deleted");
                Scan.nextLine();
            } else if (MenuChose.equals("4")) {
                ToDoList.clear();
                TotalList = 0;
                System.out.println("Task List Deleted");
                Scan.nextLine();
            } else if (MenuChose.equals("5")) {
                break;
            }
        }
    }
}