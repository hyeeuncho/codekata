package com.programmers.level2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution0905Test {

    private final Solution0905 solution0905 = new Solution0905();
    private final Solution0905_2 solution0905_2 = new Solution0905_2();
    private final Solution0905_3 solution0905_3 = new Solution0905_3();

    @Test
    void 전화번호_목록() {
        assertFalse(solution0905.solution(new String[]{"119", "97674223", "1195524421"}));
        assertTrue(solution0905.solution(new String[]{"123", "456", "789"}));
        assertFalse(solution0905.solution(new String[]{"12", "123", "1235", "567", "88"}));
    }

    @Test
    void 의상() {
        assertEquals(
                5,
                solution0905_2.solution(new String[][]{
                        {"yellow_hat", "headgear"},
                        {"blue_sunglasses", "eyewear"},
                        {"green_turban", "headgear"}
                })
        );
        assertEquals(
                3,
                solution0905_2.solution(new String[][]{
                        {"crow_mask", "face"},
                        {"blue_sunglasses", "face"},
                        {"smoky_makeup", "face"}
                })
        );
    }

    @Test
    void 할인_행사() {
        assertEquals(
                3,
                solution0905_3.solution(
                        new String[]{"banana", "apple", "rice", "pork", "pot"},
                        new int[]{3, 2, 2, 2, 1},
                        new String[]{
                                "chicken", "apple", "apple", "banana", "rice",
                                "apple", "pork", "banana", "pork", "rice",
                                "pot", "banana", "apple", "banana"
                        }
                )
        );
        assertEquals(
                0,
                solution0905_3.solution(
                        new String[]{"apple"},
                        new int[]{10},
                        new String[]{
                                "banana", "banana", "banana", "banana", "banana",
                                "banana", "banana", "banana", "banana", "banana"
                        }
                )
        );
    }
}
