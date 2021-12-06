package com.company.task22;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = 1;
        int count = 0;
        double sum = 0;

        while(n != 0) {
            n = scanner.nextInt();
            sum += n;
            count++;
        }

        System.out.println(sum / count);
    }
}
