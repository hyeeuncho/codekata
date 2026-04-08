package com.programmers.level2;

/**
 * 약수의 개수와 덧셈
 * 2026-04-08
 * level2
 */
public class Solution0408 {
    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++){
            if(getFactor(i) % 2 == 0) answer += i;
            else answer -= i;
        }

        return answer;
    }
    public int getFactor(int a){
        int count = 0;
        for(int i = 1; i <= a; i++){
            if(a % i == 0) count++;
        }
        return count;
    }
    // 완전제곱수의 약수의 개수는 홀수다.
    // if (Math.sqrt(i) % 1 == 0) answer -= i; 이렇게 풀면 아주 간단하게 해결 가능
}
