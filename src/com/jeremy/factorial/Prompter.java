package com.jeremy.factorial;

import javax.swing.*;

public class Prompter {

    public int GetFactorialPrompt() {
        JOptionPane jop = new JOptionPane();
        int factorial = Integer.parseInt(jop.showInputDialog(null, "Enter the factorial you want to resolve: ", "Factorial Calculator", JOptionPane.QUESTION_MESSAGE));
        return factorial;
    }
}
