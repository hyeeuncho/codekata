package com.programmers.level2;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 프로세스
 * 2026-09-04
 * Level 2
 */
public class Solution0904_2 {
    public int solution(int[] priorities, int location) {
        Queue<Process> queue = new ArrayDeque<>();
        for (int i = 0; i < priorities.length; i++){
            queue.offer(new Process(i, priorities[i]));
        }
        int index = 0;
        while (!queue.isEmpty()){
            Process current = queue.poll();
            boolean high = false;
            for (Process p : queue){
                if (p.priority > current.priority){
                    high = true;
                    break;
                }
            }
            if (high){
                queue.offer(current);
            }else {
                index++;
                if (current.index == location) return index;
            }
        }
        return index;

    }
    class Process {
        int index;
        int priority;
        Process(int index, int priority) {
            this.index = index;
            this.priority = priority;
        }
    }
}
