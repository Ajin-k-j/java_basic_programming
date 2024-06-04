package com.ilpbatch4.utility;
import java.util.Scanner;

public class fibcube {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (fib(i)*fib(i)*fib(i) );
        }

        System.out.println("Sum of the series: " + sum);
    }

public static int fib(int n) {
    if (n == 0)
        return 0;
    else if (n == 1)
        return 1;
    else
        return fib(n - 1) + fib(n - 2);
}
}
