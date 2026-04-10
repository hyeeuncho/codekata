package com.programmers.level2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class Solution0410Test {

    private final Solution0410 s = new Solution0410();

    @Test
    void test1() {
        int[][] arr1 = {{1, 2}, {2, 3}};
        int[][] arr2 = {{3, 4}, {5, 6}};
        System.out.println(Arrays.deepToString(s.solution(arr1, arr2)));
    }

    @Test
    void test2() {
        int[][] arr1 = {{1}, {2}};
        int[][] arr2 = {{3}, {4}};
        System.out.println(Arrays.deepToString(s.solution(arr1, arr2)));
    }
}
