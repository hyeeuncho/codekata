package com.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution0901_4Test {

    private final Solution0901_4 solution = new Solution0901_4();

    @Test
    void test1() {
        assertEquals("김서방은 1에 있다", solution.solution(new String[]{"Jane", "Kim"}));
    }
}
