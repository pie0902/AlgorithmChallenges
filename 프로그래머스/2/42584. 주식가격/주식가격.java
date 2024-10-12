import java.util.*;
class Solution {
    public int[] solution(int[] p) {
        int[] answer = new int[p.length];
        Queue<Integer> q = new LinkedList<>();
        for(int i : p){
            q.offer(i);
        }
        int idx = 0;
        while(!q.isEmpty()){
            int now = q.poll();
            int cnt = 0;
            for(int i = idx; i<p.length-1; i++){
                if(now<=p[i]){
                    cnt++;
                }
                else{
                    break;
                }
            }
            answer[idx] = cnt;
            idx++;
        }
        answer[p.length-1] = 0;
        return answer;
    }
}