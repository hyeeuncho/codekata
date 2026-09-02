package com.programmers.level2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


class Solution0413Test {
    private final Solution0413 solution0413 = new Solution0413();
    private final Solution0413_2 solution0413_2 = new Solution0413_2();

    @Test
    void 최대공약수와_최소공배수() {
        assertArrayEquals(new int[]{3, 12}, solution0413.solution(3, 12));
        assertArrayEquals(new int[]{1, 10}, solution0413.solution(2, 5));
    }

    @Test
    void 삼진법_뒤집기() {
        assertEquals(7, solution0413_2.solution(45));
        assertEquals(229, solution0413_2.solution(125));
    }
}
