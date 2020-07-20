package com.jeremy.factorial;

import java.util.Scanner;

public class Prompter {

    public int GetFactorialPrompt() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the factorial you want to resolve: ");
        int factorial = sc.nextInt();
        return factorial;
    }
}
