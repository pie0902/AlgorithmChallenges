import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Set<String> set = new HashSet<>();
        for(int i = 0; i<clothes.length; i++){
            set.add(clothes[i][1]);   
        }
        
        
        for(String s : set){
            int cnt = 0;
            for(int i = 0; i<clothes.length; i++){
                if(s.equals(clothes[i][1])){
                    cnt++;
                }
            }
            cnt+=1; 
            answer = answer * cnt;
        }
        
        
        
        return answer-1;
    }
}