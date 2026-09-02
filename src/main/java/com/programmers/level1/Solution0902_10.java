package com.programmers.level1;

import java.util.Scanner;

/**
 * 직사각형 별찍기
 * 2026-09-02
 * Level 1
 */
public class Solution0902_10 {
    public String solution(int a, int b) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < b; i++){
            sb.append("*".repeat(Math.max(0, a)));
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(new Solution0902_10().solution(a, b));
    }
}
