package com.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution0901_9Test {

    private final Solution0901_9 solution = new Solution0901_9();

    @Test
    void test1() {
        assertEquals(6, solution.solution(123));
    }

    @Test
    void test2() {
        assertEquals(24, solution.solution(987));
    }
}
