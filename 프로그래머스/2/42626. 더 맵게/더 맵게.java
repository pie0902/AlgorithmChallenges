import java.util.*;
class Solution {
    public int solution(int[] s, int k) {
        int answer = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int i : s){
            q.offer(i);
        }
        while(q.size()>1){
            int now = q.poll();
            if(now<k){
                int p = q.poll();
                int val = now +(p*2);
                q.offer(val);
                answer++;
            }
        }
        if(q.peek()<k){
            answer = -1;
        }
        return answer;
    }
}