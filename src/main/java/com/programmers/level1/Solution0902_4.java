package com.programmers.level1;

/**
 * 음양 더하기
 * 2026-09-02
 * Level 1
 */
public class Solution0902_4 {
    public int solution(int[] absolutes, boolean[] signs) {
        int sum = 0;
        for (int i = 0; i < absolutes.length; i++){
            sum += signs[i] ? absolutes[i] : -absolutes[i];
        }
        return sum;
    }
}
