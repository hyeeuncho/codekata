package com.programmers.level2;

/**
 *  내적
 *  2026-04-08
 *  level2
 */
public class Solution0408_2 {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i = 0; i<a.length; i++){
            answer += a[i]*b[i];
        }
        return answer;
    }
}
