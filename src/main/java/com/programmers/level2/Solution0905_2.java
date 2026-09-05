package com.programmers.level2;

import java.util.HashMap;
import java.util.Map;

/**
 * 의상
 * 2026-09-05
 * Level 2
 */
public class Solution0905_2 {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        for (String[] c : clothes){
            String type = c[1];
            map.put(type, map.getOrDefault(type, 0)+1);
        }
        int result = 1;
        for (int i : map.values()){
            result *= i+1;
        }
        return result - 1;
    }
}
