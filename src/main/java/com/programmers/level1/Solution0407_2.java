package com.programmers.level1;

/**
 * 나머지가 1이 되는 수 찾기
 * 2026-04-07
 * Level 1
 * n을 x로 나눈 나머지가 1이 될 때까지 x 1씩 증가
 */
public class Solution0407_2 {
    public int solution(int n){
        int x = 2;
        while (n%x != 1){
            x++;
        }
        return x;
    }
}
