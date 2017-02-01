package com.company;

import java.util.Scanner;

public class Main {
    static Scanner scnr = new Scanner(System.in);

    public static void printHeader(String col1, String col2, String col3){



        String headerOne = String.format("%-12s %-12s %-12s", col1, col2, col3);
        String headerTwo = String.format("%-12s %-12s %-12s", "=======", "=======","=======");

        System.out.println(headerOne);
        System.out.println(headerTwo);
    }

    public static int getIntWithinRange (String prompt, int min, int max){
        int num;

        do{
            System.out.println(prompt);

            while (!scnr.hasNextInt()){
                System.out.println("Input error");
                System.out.println(prompt);
                scnr.next();
            }

            num = scnr.nextInt();

            if (num < min || num > max) {
                System.out.println("Input error");
                scnr.next();
            }
        }while(num < min || num > max);

        return num;
    }

    public static void main(String[] args) {


        int userInt = getIntWithinRange("Enter an integer: ", 0, 1290);

        printHeader("Number","Squared", "Cubed");

        for (int i=1; i <= userInt; i++){
            String result = String.format("%1$-12s %2$-12s %3$-12s", i, i*i, i*i*i);
            System.out.println(result);
        }




    }
}
