package com.icha.HappyNumber;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HappyNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** Welcome to Happy Number Detector! ***");
        System.out.println("Input an integer and I'll decide whether it's a happy number or not.");
        System.out.println("Input the number here: ");

        while (!scanner.hasNextInt()) {
            System.out.println("Pls input a number (integer to be particular). Try again!");
            scanner.nextLine();
        }
        int value = scanner.nextInt();

        while (Integer.toString(value).length() > 1) {
            String[] arrOfStr = Integer.toString(value).split("");
            List<String> valueList;
            valueList = Arrays.asList(arrOfStr);
            int temp = 0;
            for (String s : valueList) {
                int newNumber = Integer.parseInt(s) * Integer.parseInt(s);
                temp += newNumber;
            }
            value = temp;
        }
        if (value == 1) {
            System.out.println("True");
            System.out.println("Congratulation! That is a happy number :)");
        } else {
            System.out.println("False");
            System.out.println("Sorry, better luck next time!");
        }
    }
}
