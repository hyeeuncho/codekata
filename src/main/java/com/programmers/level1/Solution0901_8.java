package com.programmers.level1;

import java.util.Arrays;

/**
 * 정수 내림차순으로 배치하기
 * 2026-09-01
 * Level 1
 */
public class Solution0901_8 {
    public long solution(long n) {
        String s = String.valueOf(n);
        int[] arr = Arrays.stream(s.split(""))
                .mapToInt(Integer::parseInt)
                .toArray();
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length-1; i >= 0; i--){
            sb.append(arr[i]);
        }
        return Long.parseLong(sb.toString());
    }
}
/**
 * stringbuilder에 문자도 넣을 수 있기 때문에 굳이 정수 배열로 바꿀 필요가 없음
 * String[] s = String.valueOf(n).split("");
 * Arrays.sort(s);
 * StringBuilder sb = new StringBuilder();
 * for (int i = s.length-1; i >= 0; i--){
 *      sb.append(s[i]);
 * }
 */
