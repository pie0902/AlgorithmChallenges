import java.util.Arrays;
import java.util.PriorityQueue;

class Solution {
    public int[] solution(int k, int[] score) {
        int len = score.length;
        int[] answer = new int[len];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int i = 0; i < len; i++) {
            pq.offer(score[i]);
            if (pq.size() > k) {
                pq.poll();
            }
            answer[i] = pq.peek();
        }
        
        return answer;
    }
}