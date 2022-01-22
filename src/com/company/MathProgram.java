package com.company;

import java.util.Scanner;

public class MathProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            int RandomNumber1 = (int) (Math.random() * 101);
            int RandomNumber2 = (int) (Math.random() * 101);
            int Solve = RandomNumber1 + RandomNumber2;
            System.out.println("Solve it: " + RandomNumber1 + " + " + RandomNumber2);
            System.out.println();
            int Answer = input.nextInt();
            if (Answer == Solve) {
                System.out.println("Yes this is correct answer");
            } else {
                String SolveString = Integer.toString(Solve);
                System.out.println("False correct answer was " + SolveString);
            }
        }
    }
}
