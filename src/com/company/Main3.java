package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = 5;

        for (int i = 1; i <= k; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.printf("%-4d", i);
            }
            System.out.println();
        }


        for (int i = 1; i <= k; i++) {

            for (int j = k; j >= i; j--) {

                System.out.printf("%-4d", i + k - 1);
            }
            System.out.println();
        }

    }
}