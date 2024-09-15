import java.util.*;
class Solution {
    public int solution(int[] p, int limit) {
        int answer = 0;
        int nomal = 0;
        int heavy = p.length-1;
        Arrays.sort(p);
        while(nomal<=heavy){
            if(p[nomal]+p[heavy]<=limit){
                nomal++;
            }
            heavy--;
            answer++;
        }
        return answer;
    }
}