package com.company.task15;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int sum = 0;

        for(int i = n; i <= m; i++) {
            if(m % i == 0) {
                sum += i;
            }
        }

        System.out.println(sum);
    }
}
