package com.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution0901Test {

    private final Solution0901 solution0901 = new Solution0901();
    private final Solution0901_2 solution0901_2 = new Solution0901_2();
    private final Solution0901_3 solution0901_3 = new Solution0901_3();
    private final Solution0901_4 solution0901_4 = new Solution0901_4();
    private final Solution0901_5 solution0901_5 = new Solution0901_5();
    private final Solution0901_6 solution0901_6 = new Solution0901_6();
    private final Solution0901_7 solution0901_7 = new Solution0901_7();
    private final Solution0901_8 solution0901_8 = new Solution0901_8();
    private final Solution0901_9 solution0901_9 = new Solution0901_9();
    private final Solution0901_10 solution0901_10 = new Solution0901_10();

    @Test
    void 두_정수_사이의_합() {
        assertEquals(12, solution0901.solution(3, 5));
        assertEquals(3, solution0901.solution(3, 3));
        assertEquals(12, solution0901.solution(5, 3));
    }

    @Test
    void 문자열_내_p와_y의_개수() {
        assertTrue(solution0901_2.solution("pPoooyY"));
        assertFalse(solution0901_2.solution("Pyy"));
    }

    @Test
    void 문자열_다루기_기본() {
        assertFalse(solution0901_3.solution("a234"));
        assertTrue(solution0901_3.solution("1234"));
    }

    @Test
    void 서울에서_김서방_찾기() {
        assertEquals("김서방은 1에 있다", solution0901_4.solution(new String[]{"Jane", "Kim"}));
    }

    @Test
    void 수박수박수박수박수박수() {
        assertEquals("수박수", solution0901_5.solution(3));
        assertEquals("수박수박", solution0901_5.solution(4));
    }

    @Test
    void 가운데_글자_가져오기() {
        assertEquals("c", solution0901_6.solution("abcde"));
        assertEquals("we", solution0901_6.solution("qwer"));
    }

    @Test
    void 자연수_뒤집어_배열로_만들기() {
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, solution0901_7.solution(12345));
    }

    @Test
    void 정수_내림차순으로_배치하기() {
        assertEquals(873211, solution0901_8.solution(118372));
    }

    @Test
    void 자릿수_더하기() {
        assertEquals(6, solution0901_9.solution(123));
        assertEquals(24, solution0901_9.solution(987));
    }

    @Test
    void 하샤드_수() {
        assertTrue(solution0901_10.solution(10));
        assertTrue(solution0901_10.solution(12));
        assertFalse(solution0901_10.solution(11));
        assertFalse(solution0901_10.solution(13));
    }
}
