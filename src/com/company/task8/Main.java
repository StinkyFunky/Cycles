package com.company.task8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        for(int i = n; i <= m; i++) {
            if(i % 2 == 0) {
                System.out.print(i +" ");
            }
        }
    }
}
