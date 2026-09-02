package com.programmers.level2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution0408Test {
    private final Solution0408 solution0408 = new Solution0408();
    private final Solution0408_2 solution0408_2 = new Solution0408_2();

    @Test
    void 약수의_개수와_덧셈() {
        assertEquals(43, solution0408.solution(13, 17));
        assertEquals(52, solution0408.solution(24, 27));
    }

    @Test
    void 내적() {
        assertEquals(3, solution0408_2.solution(new int[]{1, 2, 3, 4}, new int[]{-3, -1, 0, 2}));
        assertEquals(-2, solution0408_2.solution(new int[]{-1, 0, 1}, new int[]{1, 0, -1}));
    }
}
