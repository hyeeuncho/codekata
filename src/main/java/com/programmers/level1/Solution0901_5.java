package com.programmers.level1;

/**
 * 수박수박수박수박수박수?
 * 2026-09-01
 * Level 1
 */
public class Solution0901_5 {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++){
            if (i % 2 == 0) sb.append("수");
            else sb.append("박");
        }
        return sb.toString();
    }
}
/**
 * sb.append(i % 2 == 0 ? "수" : "박");로 깔끔하게 가능
 */