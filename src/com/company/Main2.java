package com.company;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.printf(" 5 ");
            }
            System.out.println();
        }

        for (int i = 1; i <= 5; i++) {

            for (int j = 5; j >= i; j--) {

                System.out.printf(" 1 ");
            }
            System.out.println();
        }

    }
}