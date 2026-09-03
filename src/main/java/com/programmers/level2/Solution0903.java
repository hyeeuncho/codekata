package com.programmers.level2;

import java.util.ArrayDeque;

/**
 * 올바른 괄호
 * 2026-09-03
 * Level 2
 */
public class Solution0903 {
    public boolean solution(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()){
            if (c == '(') stack.push(c);
            else {
                if (stack.isEmpty()) return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}

/**
 * int count = 0;
 * for (char c : s.toCharArray()){
 *     if (c == '(') count++;
 *     else count--;
 *     if (count < 0) return false;
 * }
 * return count == 0;
 * stack 안쓰고도 풀 수 있음
 */