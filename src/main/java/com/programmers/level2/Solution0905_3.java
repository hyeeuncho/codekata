package com.programmers.level2;

import java.util.HashMap;
import java.util.Map;

/**
 * 할인 행사
 * 2026-09-05
 * Level 2
 */
public class Solution0905_3 {
    public int solution(String[] want, int[] number, String[] discount) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < want.length; i++){
            map.put(want[i], number[i]);
        }
        int count = 0;
        for (int i = 0; i <= discount.length - 10; i++){
            Map<String, Integer> list = new HashMap<>();
            for (int j = i; j < i + 10; j++){
                list.put(discount[j], list.getOrDefault(discount[j], 0) + 1);
            }
            boolean match = true;
            for (String s : map.keySet()){
                if (map.get(s) > list.getOrDefault(s, 0)) match = false;
            }
            if (match) count++;
        }
        return count;
    }
}
