package com.company.task30;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();
        int n = scanner.nextInt();
        int w = scanner.nextInt();

        int total = 0;

        for(int i = 1; i <= w; i++) {
            total = total + k * i;
        }
        if(total > n) {
            System.out.println(total - n);
        }
        else {
            System.out.println(0);
        }
    }
}
