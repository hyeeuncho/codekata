package com.programmers.level2;

/**
 * 부족한 금액 계산하기
 * 2026-04-09
 * level2
 */
public class Solution0409_2 {
    public long solution(int price, int money, int count) {
        long total = 0;
        for (int i = 1; i <= count; i++){
            total += (long) price * i;
        }
        return (total - money < 0) ? 0 : Math.abs(total - money);
    }
}
