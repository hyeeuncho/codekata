package com.programmers.level2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution0903Test {

    private final Solution0903 solution0903 = new Solution0903();
    private final Solution0903_2 solution0903_2 = new Solution0903_2();

    @Test
    void 올바른_괄호() {
        assertTrue(solution0903.solution("()()"));
        assertTrue(solution0903.solution("(())()"));
        assertFalse(solution0903.solution(")()("));
        assertFalse(solution0903.solution("(()("));
    }

    @Test
    void 최댓값과_최솟값() {
        assertEquals("1 4", solution0903_2.solution("1 2 3 4"));
        assertEquals("-4 -1", solution0903_2.solution("-1 -2 -3 -4"));
        assertEquals("-1 -1", solution0903_2.solution("-1 -1"));
    }
}
