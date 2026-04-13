package com.programmers.level2;

import java.util.Scanner;

/**
 * 직사각형 별찍기
 * 2026-04-10
 * level2
 */
public class Solution0410_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0; i < b; i++){
            for (int j = 0; j < a; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
