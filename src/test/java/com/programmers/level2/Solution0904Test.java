package com.programmers.level2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution0904Test {

    private final Solution0904 solution0904 = new Solution0904();
    private final Solution0904_2 solution0904_2 = new Solution0904_2();

    @Test
    void 기능개발() {
        assertArrayEquals(
                new int[]{2, 1},
                solution0904.solution(new int[]{93, 30, 55}, new int[]{1, 30, 5})
        );
        assertArrayEquals(
                new int[]{1, 3, 2},
                solution0904.solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1})
        );
    }

    @Test
    void 프로세스() {
        assertEquals(1, solution0904_2.solution(new int[]{2, 1, 3, 2}, 2));
        assertEquals(5, solution0904_2.solution(new int[]{1, 1, 9, 1, 1, 1}, 0));
    }
}
