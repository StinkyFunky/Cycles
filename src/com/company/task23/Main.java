package com.company.task23;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = 1;
        int max = 0;

        while (n != 0) {
            n = scanner.nextInt();
            max = Math.max(n, max);
        }

        System.out.println(max);
    }
}
