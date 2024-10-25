import java.util.*;
class Solution {
    public String solution(int[] n) {
        String answer = "";
        String[] strs = new String[n.length];
        for(int i = 0; i<n.length; i++){
            strs[i] = String.valueOf(n[i]);
        }
        Arrays.sort(strs,(x,y)->(y+x).compareTo(x+y));
        answer = String.join("",strs);
        
        
        
        return answer.startsWith("0") ? "0" : answer;
    }
}