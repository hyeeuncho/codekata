package com.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0407_2Test {

    private final Solution0407_2 solution = new Solution0407_2();
    @Test
    void test1() {
        assertEquals(3, solution.solution(10));
    }
    @Test
    void test2() {
        assertEquals(11, solution.solution(12));
    }
}