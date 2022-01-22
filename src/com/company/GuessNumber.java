package com.company;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);
            int GuessNumber = (int) (Math.random() * 100 + 1);
            int TypeNumber = input.nextInt();
            int points = 0;
            if (TypeNumber == GuessNumber) {
                System.out.println("Your answer is correct");
                points = points + 1;
            }else {
                String GuessNumberString = Integer.toString(GuessNumber);
                System.out.println("Wrong correct answer was " + GuessNumberString);
            }
        }
    }
}
