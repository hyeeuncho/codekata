package com.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution0901_10Test {

    private final Solution0901_10 solution = new Solution0901_10();

    @Test
    void test1() {
        assertTrue(solution.solution(10));
    }

    @Test
    void test2() {
        assertTrue(solution.solution(12));
    }

    @Test
    void test3() {
        assertFalse(solution.solution(11));
    }

    @Test
    void test4() {
        assertFalse(solution.solution(13));
    }
}
