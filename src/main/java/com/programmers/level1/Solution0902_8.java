package com.programmers.level1;

/**
 * 약수의 합
 * 2026-09-02
 * Level 1
 */
public class Solution0902_8 {
    public int solution(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++){
            if (n % i == 0) sum += i;
        }
        return sum;
    }
}
