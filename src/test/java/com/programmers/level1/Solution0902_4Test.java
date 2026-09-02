package com.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution0902_4Test {

    private final Solution0902_4 solution = new Solution0902_4();

    @Test
    void test1() {
        assertEquals(9, solution.solution(new int[]{4, 7, 12}, new boolean[]{true, false, true}));
    }

    @Test
    void test2() {
        assertEquals(0, solution.solution(new int[]{1, 2, 3}, new boolean[]{false, false, true}));
    }
}
