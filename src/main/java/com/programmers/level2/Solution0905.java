package com.programmers.level2;

import java.util.HashSet;
import java.util.Set;

/**
 * 전화번호 목록
 * 2026-09-05
 * Level 2
 */
public class Solution0905 {
    public boolean solution(String[] phoneBook) {
        Set<String> set = new HashSet<>();
        for (String s : phoneBook){
            set.add(s);
        }
        for (String s : phoneBook){
            for (int i = 1; i < s.length(); i++){
                String pre = s.substring(0, i);
                if (set.contains(pre)) return false;
            }
        }
        return true;
    }
}

/**
 * startsWith로 푸는 방식
 * Arrays.sort(phoneBook);
 * for (int i = 0; i < phoneBook.length-1; i++){
 *     if (phoneBook[i+1].startsWith(phoneBook[i])) return false;
 * }
 * return true;
 */