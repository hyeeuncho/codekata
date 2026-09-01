package com.programmers.level1;

/**
 * 자릿수 더하기
 * 2026-09-01
 * Level 1
 */
public class Solution0901_9 {
    public int solution(int n) {
        int result = 0;
        while (n > 0){
            result += n % 10;
            n /= 10;
        }
        return result;
    }
}
