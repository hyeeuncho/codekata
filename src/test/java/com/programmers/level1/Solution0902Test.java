package com.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution0902Test {

    private final Solution0902 solution = new Solution0902();

    @Test
    void test1() {
        assertArrayEquals(new int[]{5, 10}, solution.solution(new int[]{5, 9, 7, 10}, 5));
    }

    @Test
    void test2() {
        assertArrayEquals(new int[]{1, 2, 3, 36}, solution.solution(new int[]{2, 36, 1, 3}, 1));
    }

    @Test
    void test3() {
        assertArrayEquals(new int[]{-1}, solution.solution(new int[]{3, 2, 6}, 10));
    }

    @Test
    void test4() {
        System.out.println(solution.solution(new int[]{5, 9, 7, 10}, 5));
    }
}
