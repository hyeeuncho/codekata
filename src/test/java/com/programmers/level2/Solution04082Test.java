package com.programmers.level2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class Solution04082Test {
    private final Solution0408_2 s = new Solution0408_2();

    static Stream<int[][]> testCases() {
        return Stream.of(
            new int[][]{{1, 2, 3, 4}, {-3, -1, 0, 2}},
            new int[][]{{-1, 0, 1}, {1, 0, -1}}
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void solution(int[][] arrays) {
        int[] a = arrays[0];
        int[] b = arrays[1];
        System.out.println("a=" + java.util.Arrays.toString(a)
            + ", b=" + java.util.Arrays.toString(b)
            + " => " + s.solution(a, b));
    }
}