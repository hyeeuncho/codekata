package com.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution0902Test {

    private final Solution0902 solution0902 = new Solution0902();
    private final Solution0902_2 solution0902_2 = new Solution0902_2();
    private final Solution0902_3 solution0902_3 = new Solution0902_3();
    private final Solution0902_4 solution0902_4 = new Solution0902_4();
    private final Solution0902_5 solution0902_5 = new Solution0902_5();
    private final Solution0902_6 solution0902_6 = new Solution0902_6();
    private final Solution0902_7 solution0902_7 = new Solution0902_7();
    private final Solution0902_8 solution0902_8 = new Solution0902_8();
    private final Solution0902_9 solution0902_9 = new Solution0902_9();
    private final Solution0902_10 solution0902_10 = new Solution0902_10();

    @Test
    void 나누어_떨어지는_숫자_배열() {
        assertArrayEquals(new int[]{5, 10}, solution0902.solution(new int[]{5, 9, 7, 10}, 5));
        assertArrayEquals(new int[]{1, 2, 3, 36}, solution0902.solution(new int[]{2, 36, 1, 3}, 1));
        assertArrayEquals(new int[]{-1}, solution0902.solution(new int[]{3, 2, 6}, 10));
    }

    @Test
    void 제일_작은_수_제거하기() {
        assertArrayEquals(new int[]{4, 3, 2}, solution0902_2.solution(new int[]{4, 3, 2, 1}));
        assertArrayEquals(new int[]{-1}, solution0902_2.solution(new int[]{10}));
    }

    @Test
    void 없는_숫자_더하기() {
        assertEquals(14, solution0902_3.solution(new int[]{1, 2, 3, 4, 6, 7, 8, 0}));
        assertEquals(6, solution0902_3.solution(new int[]{5, 8, 4, 0, 6, 7, 9}));
    }

    @Test
    void 음양_더하기() {
        assertEquals(9, solution0902_4.solution(new int[]{4, 7, 12}, new boolean[]{true, false, true}));
        assertEquals(0, solution0902_4.solution(new int[]{1, 2, 3}, new boolean[]{false, false, true}));
    }

    @Test
    void 내적() {
        assertEquals(3, solution0902_5.solution(new int[]{1, 2, 3, 4}, new int[]{-3, -1, 0, 2}));
        assertEquals(-2, solution0902_5.solution(new int[]{-1, 0, 1}, new int[]{1, 0, -1}));
    }

    @Test
    void 핸드폰_번호_가리기() {
        assertEquals("*******4444", solution0902_6.solution("01033334444"));
        assertEquals("*****8888", solution0902_6.solution("027778888"));
    }

    @Test
    void 콜라츠_추측() {
        assertEquals(8, solution0902_7.solution(6));
        assertEquals(4, solution0902_7.solution(16));
        assertEquals(-1, solution0902_7.solution(626331));
    }

    @Test
    void 약수의_합() {
        assertEquals(28, solution0902_8.solution(12));
        assertEquals(6, solution0902_8.solution(5));
    }

    @Test
    void 평균_구하기() {
        assertEquals(2.5, solution0902_9.solution(new int[]{1, 2, 3, 4}));
        assertEquals(5.0, solution0902_9.solution(new int[]{5, 5}));
    }

    @Test
    void 직사각형_별찍기() {
        assertEquals("***\n***\n", solution0902_10.solution(3, 2));
        assertEquals("*****\n*****\n*****\n", solution0902_10.solution(5, 3));
    }
}
