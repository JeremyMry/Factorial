package com.jeremy.factorial;

import javax.swing.*;

public class Factorial {

    public int factorialCalcul(int n) {
        if (n == 1) return 1;
        else return n * factorialCalcul(n-1);
    }
}
