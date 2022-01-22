package com.company;
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1(Celsius to Fahrenheit) or 2(Fahrenheit to Celsius)");
        String AskConvert = input.nextLine();
        if (AskConvert.equals("1")) {
            System.out.println("Type Fahrenheit value");
            int Fahrenheit = Integer.parseInt(input.nextLine());
            int ResultCelsius = (Fahrenheit - 32)*5/9;
            System.out.println(ResultCelsius);
        }
        else if (AskConvert.equals("2")) {
            System.out.println("Type Celsius value");
            int Celsius = Integer.parseInt(input.nextLine());
            int ResultFahrenheit = (Celsius * 9/5) + 32;
            System.out.println(ResultFahrenheit);
        }
    }
}
