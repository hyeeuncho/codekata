package com.programmers.level2;

import java.util.Arrays;

/**
 *  문자열 내림차순으로 배치하기
 *  2026-04-09
 *  level2
 */
public class Solution0409 {
    public String solution(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder(new String(arr));
        return sb.reverse().toString();
    }

}
