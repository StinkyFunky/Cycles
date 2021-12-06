package com.company.task25;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double d = 1.0;
        double multi = 0.0;

        while(d != 0) {
            d = scanner.nextDouble();
            multi *= d;
        }

        System.out.println(multi);
    }
}
