package com.company.task6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for(int i = 0; i <= n; i++) {
            if(i % 2 == 0) {
                System.out.print(i +" ");
            }
        }
    }
}
