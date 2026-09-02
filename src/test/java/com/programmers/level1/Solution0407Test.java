package com.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution0407Test {

    private final Solution0407 solution0407 = new Solution0407();
    private final Solution0407_2 solution0407_2 = new Solution0407_2();

    @Test
    void 두_수의_차() {
        assertEquals(-1, solution0407.solution(2, 3));
        assertEquals(98, solution0407.solution(100, 2));
    }

    @Test
    void 나머지가_1이_되는_수_찾기() {
        assertEquals(3, solution0407_2.solution(10));
        assertEquals(11, solution0407_2.solution(12));
    }
}
