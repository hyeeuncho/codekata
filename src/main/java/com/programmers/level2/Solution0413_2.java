package com.programmers.level2;

/**
 * 3진법 뒤집기
 * 2026-04-13
 * level2
 */
public class Solution0413_2 {
    public int solution(int n) {
        StringBuilder s = new StringBuilder();
        while (n > 0){
            s.append(n % 3);
            n /= 3;
        }
        System.out.println(s);
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            answer = answer * 3 + (s.charAt(i) - '0');
        }

        return answer;
    }
}
