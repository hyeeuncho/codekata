package com.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution0902_2Test {

    private final Solution0902_2 solution = new Solution0902_2();

    @Test
    void test1() {
        assertArrayEquals(new int[]{4, 3, 2}, solution.solution(new int[]{4, 3, 2, 1}));
    }

    @Test
    void test2() {
        assertArrayEquals(new int[]{-1}, solution.solution(new int[]{10}));
    }
}
