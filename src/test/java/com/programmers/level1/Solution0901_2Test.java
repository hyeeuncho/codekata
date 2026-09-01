package com.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution0901_2Test {

    private final Solution0901_2 solution = new Solution0901_2();

    @Test
    void test1() {
        assertTrue(solution.solution("pPoooyY"));
    }

    @Test
    void test2() {
        assertFalse(solution.solution("Pyy"));
    }
}
