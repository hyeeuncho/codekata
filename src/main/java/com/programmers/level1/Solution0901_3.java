package com.programmers.level1;

/**
 * 문자열 다루기 기본
 * 2026-09-01
 * Level 1
 */
public class Solution0901_3 {
    public boolean solution(String s) {
        if (s.length() != 4 && s.length() != 6) return false;
        for (int i = 0; i < s.length(); i++){
            if (!Character.isDigit(s.charAt(i))) return false;
        }
        return true;
    }
}
/**
 * String regex = "^(\\d{4}|\\d{6})$";
 * return s.matches(regex);
 * 로 풀면 간편함.
*/