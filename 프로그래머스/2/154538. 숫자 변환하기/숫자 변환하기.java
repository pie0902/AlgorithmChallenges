import java.util.*;
class Solution {
    public int solution(int x, int y, int n) {
        int answer = 0;
        Queue<int[]> q = new LinkedList<>();
        Set<Integer> v = new HashSet<>();
        q.offer(new int[]{x,0});
        while(!q.isEmpty()){
            int[] cur = q.poll();
            int val = cur[0];
            int step = cur[1];
            if(val == y){
                return step;
            }
            int[] ary = {val + n,val * 2,val *3};
            for(int next:ary){
                if(!v.contains(next)&&next<=y){
                    q.offer(new int[]{next,step+1});
                    v.add(next);
                }
            }
        }
        
        
        return -1;
    }
}