package com.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution0901_5Test {

    private final Solution0901_5 solution = new Solution0901_5();

    @Test
    void test1() {
        assertEquals("수박수", solution.solution(3));
    }

    @Test
    void test2() {
        assertEquals("수박수박", solution.solution(4));
    }
}
