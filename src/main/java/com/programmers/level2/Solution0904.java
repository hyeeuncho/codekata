package com.programmers.level2;

import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 * 기능개발
 * 2026-09-04
 * Level 2
 */
public class Solution0904 {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < progresses.length; i++){
            int day = (100 - progresses[i] + speeds[i] - 1)/speeds[i];
            queue.offer(day);
        }
        while (!queue.isEmpty()){
            int current = queue.poll();
            int count = 1;
            while (!queue.isEmpty() && queue.peek() <= current){
                count++;
                queue.poll();
            }
            result.add(count);
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
