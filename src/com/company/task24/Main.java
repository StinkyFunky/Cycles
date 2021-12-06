package com.company.task24;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int multi = 1;

        for(int i = 1; i <= n; i++) {
            multi *= i;
        }

        System.out.println(multi);
    }
}
