package com.company;

import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class TextAdventureGame {
    static void Wait(int wait) {
        try {
            TimeUnit.SECONDS.sleep(wait);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static int d20() {
        Random randomNum = new Random();
        int diceResult = 0;
        int result = randomNum.nextInt(20) + 1;
        diceResult = diceResult + result;
        return diceResult;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Armor = 10;
        int Hp = 13;
        String[] Shop = {"Leather Armor cost 20coins", "Heel Potion 5coins", "Wakanda Sword 25coins"};
        System.out.println("***What is your name?***");
        String PlayerName = input.nextLine();
        System.out.println("***So welcome in Asmart " + PlayerName + "***");
        Wait(1);
        System.out.println("***At this moment you go to Bar. Where you will meet with Baron***");
        Wait(3);
        System.out.println("Baron - Hay " + PlayerName + " i didn't see you along of time...");
        Wait(4);
        System.out.println("Baron - So i have quest for you do you want help us in battle with enemy city? ");
        String HelpCityQuest = input.nextLine();
        if (HelpCityQuest == "no".toLowerCase()) {
            System.out.println("Baron - Okay, good bay your help was important...");
        } else {
            System.out.println("--------------CHAPTER 1 Battle with enemy city--------------");
            System.out.println("Baron - I'm so glad for that");
            Wait(1);
            System.out.println("***You have got a sword***");
            boolean Sword = true;
            int SwordHp = 5;
            System.out.println("***Battle is started***");
            Wait(2);
            if (d20() + Armor == 15) {
                System.out.println("***You passed defend***");
            } else {
                Hp = Hp - 1;
                System.out.println("***" + "Hp is " + Hp + "***");
            }
            System.out.println("***You are see two enemies which one you want attack***");
            Wait(1);
            System.out.println("enemy 1 - Hey you come on fight with me - ***enemy 1 is a best of best warrior in enemy city***");
            Wait(4);
            System.out.println("enemy 2 - What a stupid guy hahahah - ***enemy 2 is only fun gay which like fighting***");
            String ChoseEnemyCh1 = input.nextLine();
            if (Objects.equals(ChoseEnemyCh1, "enemy 1".toLowerCase())) {
                Wait(2);
                System.out.println("enemy 1 - Okay let's fight");
                if (Sword) {
                    if ((d20() + SwordHp) - 5 >= 15) {
                        Wait(2);
                        System.out.println("***You killed him***");
                    } else {
                        Hp = Hp - 2;
                        System.out.println("***" + Hp + "***");
                    }
                } else {
                    if (d20() - 5 >= 16) {
                        Wait(2);
                        System.out.println("***You killed him***");
                    } else {
                        Hp = Hp - 4;
                        System.out.println("***" + Hp + "***");
                    }
                }
            } else if (Objects.equals(ChoseEnemyCh1, "enemy 2".toLowerCase())) {
                Wait(2);
                System.out.println("enemy 2 - Hahahaha you want fight, okay");
                if (Sword) {
                    if ((d20() + SwordHp) - 3 >= 10) {
                        Wait(2);
                        System.out.println("***You killed him***");
                    } else {
                        Hp = Hp - 1;
                        System.out.println("***" + Hp + "***");
                    }
                } else {
                    if (d20() - 5 >= 12) {
                        Wait(2);
                        System.out.println("***You killed him***");
                    } else {
                        Hp = Hp - 2;
                        System.out.println("***" + "Your hp is " + Hp + "***");
                    }
                }
            } else {
                System.out.println("WASTED \n Your hp is null");
            }
            System.out.println("--------------CHAPTER 2 Dungeons in AloneWood--------------");
            Wait(3);
            Hp = 15;
            System.out.println("You go to shop");
            for (String i : Shop) {
                Wait(1);
                System.out.println(i);
            }
        }
    }
}


