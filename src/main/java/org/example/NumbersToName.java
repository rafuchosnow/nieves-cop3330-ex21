package org.example;

import java.util.Scanner;

public class NumbersToName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the number of the month: ");
        String numberString = input.nextLine();
        int number = Integer.parseInt(numberString);
        
        String month = switch (number) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "incorrect";
        };

        System.out.println("The name of the month is " + month + ".");
    }
}
