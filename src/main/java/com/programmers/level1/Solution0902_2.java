package com.programmers.level1;

/**
 * 제일 작은 수 제거하기
 * 2026-09-02
 * Level 1
 */
public class Solution0902_2 {
    public int[] solution(int[] arr) {
        if (arr.length == 1) return new int[]{-1};

        int min = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < arr[min]) min = i;
        }

        int index = 0;
        int[] result = new int[arr.length-1];
        for (int j = 0; j < arr.length; j++){
            if (j != min) {
                result[index++] = arr[j];
            }
        }
        return result;
    }
}
