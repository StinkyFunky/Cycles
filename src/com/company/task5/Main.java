package com.company.task5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        for(int i = n; i <= m; i++) {
            System.out.print(i + " ");
        }
    }
}
