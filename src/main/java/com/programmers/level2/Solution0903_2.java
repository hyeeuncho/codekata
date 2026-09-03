package com.programmers.level2;

import java.util.Arrays;

/**
 * 최댓값과 최솟값
 * 2026-09-03
 * Level 2
 */
public class Solution0903_2 {
    public String solution(String s) {

        int[] arr = Arrays.stream(s.split(" "))
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();
        return arr[0] + " " + arr[arr.length-1];
    }
}
/**
 *     String[] numbers = s.split(" ");
 *
 *     int min = Integer.MAX_VALUE;
 *     int max = Integer.MIN_VALUE;
 *
 *     for (String number : numbers) {
 *             int value = Integer.parseInt(number);
 *
 *             min = Math.min(min, value);
 *             max = Math.max(max, value);
 *         }
 *
 *     return min + " " + max;
 *     정렬 없이 풀 수 있음
 */