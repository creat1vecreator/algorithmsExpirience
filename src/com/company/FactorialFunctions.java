package com.company;

public class FactorialFunctions {
    public static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        int result = 1;

        for (int i = n; i >= 1; i--) {
            result *= i;
        }

        return result;
    }

    public static int recurtionFactorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * recurtionFactorial(n - 1);

    }

    public static int recurtionNumberOfFibonnachi(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return recurtionNumberOfFibonnachi(n - 1) + recurtionNumberOfFibonnachi(n - 2);

    }

}
