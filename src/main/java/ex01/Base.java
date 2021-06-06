package ex01;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Juan Nicora
 */

/*
Exercise 1 - Saying Hello
Create a program that prompts for your name and prints a greeting using your name.

Example Output
What is your name? Brian
Hello, Brian, nice to meet you!

Constraint
Keep the input, string concatenation, and output separate.
 */

import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        System.out.print("What is your name? ");

        Scanner in = new Scanner(System.in);
        String name = in.nextLine();

        String x = "Hello, "+ name +", nice to meet you!";

        System.out.println(x);

    }
}
