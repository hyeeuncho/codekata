package com.programmers.level2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution0409Test {

    private final Solution0409 solution0409 = new Solution0409();
    private final Solution0409_2 solution0409_2 = new Solution0409_2();

    @Test
    void 문자열_내림차순으로_배치하기() {
        assertEquals("gfedcbZ", solution0409.solution("Zbcdefg"));
    }

    @Test
    void 부족한_금액_계산하기() {
        assertEquals(10, solution0409_2.solution(3, 20, 4));
    }
}
