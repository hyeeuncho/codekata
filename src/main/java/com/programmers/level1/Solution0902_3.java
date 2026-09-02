package com.programmers.level1;

import java.util.Arrays;

/**
 * 없는 숫자 더하기
 * 2026-09-02
 * Level 1
 */
public class Solution0902_3 {
    public int solution(int[] numbers) {
        int[] arr = new int[10];
        for (int i : numbers){
            arr[i]++;
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 0) sum += i;
        }
        return sum;
    }
}
/**
 * int sum = 45;
 * for (int i : numbers){
 *     sum -= i;
 * }
 * 아주 짧고 신박한 풀이..
 */