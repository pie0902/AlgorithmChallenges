import java.util.*;

class Solution {
    public String[] solution(String[] p, String[] c) {
        Map<String,Integer> pm = new HashMap<>();
        
        for(int i = 0; i<p.length; i++){
            pm.put(p[i],i);
        }
        
        for(String calling : c){
            int idx = pm.get(calling);
            
            String temp = p[idx];
            p[idx] = p[idx-1];
            p[idx-1] = temp;
            
            pm.put(p[idx],idx);
            pm.put(p[idx-1],idx-1);
            
        }
        
        return p;
    }
}