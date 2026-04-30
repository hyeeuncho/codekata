package com.programmers.level3;

public class Solution0430 {
    public int solution(int a, int b, int n) {
        int answer = 0;

        while (n >= a) {
            int get = (n / a) * b;
            int r = n % a;
            answer += get;
            n = get + r;
        }

        return answer;
    }
}
