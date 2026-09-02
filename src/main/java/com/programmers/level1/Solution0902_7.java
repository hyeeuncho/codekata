package com.programmers.level1;

/**
 * 콜라츠 추측
 * 2026-09-02
 * Level 1
 */
public class Solution0902_7 {
    public int solution(int num) {
        if (num == 1) return 0;
        int count = 0;
        long n = num;
        while (n != 1){
            if (count >= 500) return -1;
            if (n % 2 == 0) n /= 2;
            else n = n * 3 + 1;
            count++;
        }
        return count;

    }
}
