package com.company.task17;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum = 0;
        int k = 1;
        for(int i = 1; i <= n; i++, k+= 2) {
            if(n % 2 == 1) {
                sum += k;
            }
        }
        System.out.println(sum);
    }
}
