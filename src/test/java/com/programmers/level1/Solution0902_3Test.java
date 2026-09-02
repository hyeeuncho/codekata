package com.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution0902_3Test {

    private final Solution0902_3 solution = new Solution0902_3();

    @Test
    void test1() {
        assertEquals(14, solution.solution(new int[]{1, 2, 3, 4, 6, 7, 8, 0}));
    }

    @Test
    void test2() {
        assertEquals(6, solution.solution(new int[]{5, 8, 4, 0, 6, 7, 9}));
    }
}
