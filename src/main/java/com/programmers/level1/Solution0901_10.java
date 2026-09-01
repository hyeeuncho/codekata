package com.programmers.level1;

/**
 * 하샤드 수
 * 2026-09-01
 * Level 1
 */
public class Solution0901_10 {
    public boolean solution(int x) {
        return x % hap(x) == 0;
    }
    public int hap(int n) {
        int result = 0;
        while (n > 0){
            result += n % 10;
            n /= 10;
        }
        return result;
    }
}
