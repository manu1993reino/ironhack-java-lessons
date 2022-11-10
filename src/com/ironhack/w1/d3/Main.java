package com.ironhack.w1.d3;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please introduce your name");

        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        System.out.println("Now introduce your age");
        int age = scanner.nextInt();

        while (age < 0) {
            System.err.println("Your age cannot be negative");
            age = scanner.nextInt();
        }

        if (age > 18) {
            System.out.println("Welcome this app");
        } else {
            System.out.println("Access forbidden");
        }

        System.out.println("Please introduce a phrase");
        scanner.nextLine();
        String line = scanner.nextLine();

        System.out.println(line);

        String[] lineArray = line.split(" ");

        for (int i = 0; i < lineArray.length; i++) {
            System.out.println(lineArray[i]);
            if(lineArray[i].charAt(0) == 'Q'){
                System.out.println("Bien");
            }
        }

        //  System.err.println("ERROR");

        scanner.close();
    }
}
