package com.programmers.level1;

/**
 * 두 정수 사이의 합
 * 2026-09-01
 * Level 1
 */
public class Solution0901 {
    public long solution(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        int sum = 0;
        for (int i = min; i <= max; i++){
            sum += i;
        }
        return sum;
    }
}
