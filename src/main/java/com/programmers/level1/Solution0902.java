package com.programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 나누어 떨어지는 숫자 배열
 * 2026-09-02
 * Level 1
 */
public class Solution0902 {
    public int[] solution(int[] arr, int divisor) {
        Arrays.sort(arr);
        int num = 0;
        ArrayList<Integer> result = new ArrayList<>();
        for (int i : arr) {
            if (i % divisor == 0) {
                num++;
                result.add(i);
            }
        }
        int[] answer = result.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        if (num == 0) return new int[]{-1};
        else return answer;
    }
}
/**
 * int[] answer = Arrays.stream(arr)
 *                 .filter(i -> i % divisor == 0)
 *                 .sorted()
 *                 .toArray();
 * if (answer.length > 0) return answer;
 * else return new int[]{-1};
 * 이렇게 처음부터 스트림 쓰면 깔끔
 */