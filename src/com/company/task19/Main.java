package com.company.task19;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        double sum = 0;
        double count = 0;

        for(int i = n; i <= m; i++) {
            count++;
            sum += i;
        }

        System.out.println(sum / count);
    }
}
