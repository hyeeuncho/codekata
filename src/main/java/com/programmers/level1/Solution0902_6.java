package com.programmers.level1;

import java.util.Arrays;

/**
 * 핸드폰 번호 가리기
 * 2026-09-02
 * Level 1
 */
public class Solution0902_6 {
    public String solution(String phoneNumber) {
        char[] num = phoneNumber.toCharArray();
        for (int i = 0; i < num.length - 4; i++){
            num[i] = '*';
        }
        return String.valueOf(num);
    }
}
