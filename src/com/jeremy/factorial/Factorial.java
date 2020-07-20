package com.jeremy.factorial;

public class Factorial {

    public int factorialCalcul(int n) {
        if (n == 1) return 1;
        else return n * factorialCalcul(n-1);
    }
}
