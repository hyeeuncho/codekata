package com.programmers.level1;

/**
 * 자연수 뒤집어 배열로 만들기
 * 2026-09-01
 * Level 1
 */
public class Solution0901_7 {
    public int[] solution(long n) {
        String s = String.valueOf(n);
        int len = s.length();
        int[] answer = new int[len];
        int i = 0;
        while (n > 0){
            answer[i] = (int) n % 10;
            i++;
            n /= 10;
        }
        return answer;
    }
}
