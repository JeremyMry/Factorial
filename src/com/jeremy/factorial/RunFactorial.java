package com.jeremy.factorial;

import java.util.Scanner;

public class RunFactorial {
     public static void main(String[] args) {

         Prompter prompt = new Prompter();
         int factorial = prompt.GetFactorialPrompt();

         Factorial fact = new Factorial();
         System.out.println(fact.factorialCalcul(factorial));
     }
}
