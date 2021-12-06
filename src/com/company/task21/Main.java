package com.company.task21;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = 1;
        int sum = 0;

        while(n != 0) {
            n = scanner.nextInt();
            sum += n;
        }

        System.out.println(sum);
    }
}
