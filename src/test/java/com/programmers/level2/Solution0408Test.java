package com.programmers.level2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0408Test {
    private final Solution0408 s = new Solution0408();

    @Test
    void test1(){ assertEquals(43, s.solution(13,17));}

    @Test
    void test2(){ assertEquals(52, s.solution(24,27));}

}