package com.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution0901Test {

    private final Solution0901 solution = new Solution0901();

    @Test
    void test1() {
        assertEquals(12, solution.solution(3, 5));
    }

    @Test
    void test2() {
        assertEquals(3, solution.solution(3, 3));
    }

    @Test
    void test3() {
        assertEquals(12, solution.solution(5, 3));
    }
}
