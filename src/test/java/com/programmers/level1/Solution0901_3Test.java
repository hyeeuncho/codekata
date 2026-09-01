package com.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution0901_3Test {

    private final Solution0901_3 solution = new Solution0901_3();

    @Test
    void test1() {
        assertFalse(solution.solution("a234"));
    }

    @Test
    void test2() {
        assertTrue(solution.solution("1234"));
    }
}
