package com.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution0901_7Test {

    private final Solution0901_7 solution = new Solution0901_7();

    @Test
    void test1() {
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, solution.solution(12345));
    }
}
