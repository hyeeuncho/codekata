package com.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution0407Test {

    private final Solution0407 solution = new Solution0407();

    @Test
    void test1() {
        assertEquals(-1, solution.solution(2, 3));
    }

    @Test
    void test2() {
        assertEquals(98, solution.solution(100, 2));
    }
}
