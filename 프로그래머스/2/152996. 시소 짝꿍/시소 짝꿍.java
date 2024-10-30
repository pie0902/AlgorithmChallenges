import java.util.*;
class Solution {
    public long solution(int[] w) {
        long answer = 0;
        Arrays.sort(w);
        Map<Double, Integer> map = new HashMap<>();
        for(int i : w){
            double a = i * 1.0;
            double b = (i * 1.0)/2.0;
            double c = (i * 2.0)/3.0;
            double d = (i * 3.0)/4.0;
            if(map.containsKey(a)) answer += map.get(a);
            if(map.containsKey(b)) answer += map.get(b);
            if(map.containsKey(c)) answer += map.get(c);
            if(map.containsKey(d)) answer += map.get(d);
            map.put((i*1.0), map.getOrDefault((i*1.0), 0)+1);
            
        }
        return answer;
    }
}