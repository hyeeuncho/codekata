package com.programmers.level3;

/**
 * 크기가 작은 부분 문자열
 * 2026-04-17
 * level3
 */
public class Solution0417 {
    public int solution(String t, String p) {
        int count = 0;
        for (int i = 0; i < t.length() - p.length() + 1; i++) {
            if (Long.parseLong(t.substring(i, i + p.length())) <= Long.parseLong(p)) count++;
        }
        return count;
    }
}
