package com.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution0901_6Test {

    private final Solution0901_6 solution = new Solution0901_6();

    @Test
    void test1() {
        assertEquals("c", solution.solution("abcde"));
    }

    @Test
    void test2() {
        assertEquals("we", solution.solution("qwer"));
    }
}
