package com.programmers.level2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;


class Solution0413Test {
    private final Solution0413 s = new Solution0413();

    @Test
    void test(){
        int[] answer = s.solution(3, 12);
        System.out.println(Arrays.toString(answer));
    }

}