package com.jeremy.factorial;

import javax.swing.*;

public class RunFactorial {
     public static void main(String[] args) {

         Prompter prompt = new Prompter();
         int factorial = prompt.GetFactorialPrompt();

         Factorial fact = new Factorial();

         JOptionPane jop = new JOptionPane();
         jop.showMessageDialog(null, "The result is " + fact.factorialCalcul(factorial), "Factorial Calculator", JOptionPane.INFORMATION_MESSAGE);
     }
}
