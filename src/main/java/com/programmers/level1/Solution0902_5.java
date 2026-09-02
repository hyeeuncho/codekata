package com.programmers.level1;

/**
 * 내적
 * 2026-09-02
 * Level 1
 */
public class Solution0902_5 {
    public int solution(int[] a, int[] b) {
        int sum = 0;
        for (int i = 0; i < a.length; i++){
            sum += a[i]*b[i];
        }
        return sum;
    }
}
