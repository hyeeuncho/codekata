package com.programmers.level1;

/**
 * 서울에서 김서방 찾기
 * 2026-09-01
 * Level 1
 */
public class Solution0901_4 {
    public String solution(String[] seoul) {
        int x = 0;
        for (String s : seoul){
            if (s.equals("Kim")) break;
            x++;
        }
        return "김서방은 " + x + "에 있다";
    }
}
