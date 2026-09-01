package com.programmers.level1;

/**
 * 가운데 글자 가져오기
 * 2026-09-01
 * Level 1
 */
public class Solution0901_6 {
    public String solution(String s) {
        int index = s.length() / 2;
        if (s.length() % 2 == 0){
            return s.substring(index-1, index + 1);
        }else return s.substring(index, index +1);
    }
}
