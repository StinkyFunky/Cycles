package com.company.task3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        int n = scanner.nextInt();

        int i = 0;

        while(i < n) {
            System.out.println(str);
            i++;
        }
    }
}
