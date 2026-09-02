package com.programmers.level1;

import java.util.Arrays;

/**
 * 평균 구하기
 * 2026-09-02
 * Level 1
 */
public class Solution0902_9 {
    public double solution(int[] arr) {
        return Arrays.stream(arr).average().orElse(0);
    }
}
