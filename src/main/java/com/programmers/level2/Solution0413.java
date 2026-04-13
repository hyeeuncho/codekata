package com.programmers.level2;

/**
 * 최대공약수와 최소공배수
 * 2026-04-13
 * level2
 */
public class Solution0413 {
    public int[] solution(int n, int m) {

        return new int[]{gcd(n,m),(int)((long)n*m/gcd(n,m))};
    }
    public int gcd(int n, int m){
        while (m != 0){
            int i = m;
            m = n % m;
            n = i;
        }
        return n;
    }
}
