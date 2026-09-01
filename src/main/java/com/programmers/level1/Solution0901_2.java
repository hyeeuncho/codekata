package com.programmers.level1;

/**
 * 문자열 내 p와 y의 개수
 * 2026-09-01
 * Level 1
 */
public class Solution0901_2 {
    public boolean solution(String s) {
        int p = 0;
        int y = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == 'p') p++;
            else if(s.charAt(i) == 'y') y++;
        }
        return p == y;
    }
}
