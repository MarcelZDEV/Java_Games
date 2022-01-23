package com.company;

import java.text.BreakIterator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class StudentManagement {
    static void Wait(int wait) {
        try {
            TimeUnit.SECONDS.sleep(wait);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<String, String> data = new HashMap<String, String>();
        data.put("Marcel", "7B");
        data.put("Hamilton", "7C");
        data.put("Verstappen", "1C");
        System.out.println("---------Welcome In Panel Student Management---------");
        Wait(2);
        while (true) {
            System.out.println("------------------1 Show Student----------------------");
            Wait(1);
            System.out.println("-------------------2 Add Student-----------------------");
            Wait(1);
            System.out.println("----------------------3 Quit--------------------------");
            String ChoseOption = input.nextLine();
            if (ChoseOption.equals("1")) {
                System.out.println(data);
            } else if (ChoseOption.equals("2")) {
                System.out.println("Write Student Name");
                String StudentName = input.nextLine();
                System.out.println("Write Student Class");
                String StudentClass = input.nextLine();
                Wait(1);
                data.put(StudentName, StudentClass);
                System.out.println("Student Added");
                Wait(1);
                System.out.println(data);
            } else if (ChoseOption.equals("3")) {
                break;
            } else break;
        }
    }
}
