import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        List<String> strs = new ArrayList<>();
        String temp = "";
        char[] chars = s.toCharArray();
        char c = chars[0];
        int cnt1 = 0;
        int cnt2 = 0;
        for(int i = 0; i<chars.length; i++){
            
               if(chars[i]==c){
                   cnt1++;
                   temp+=chars[i];
               }else{
                   cnt2++;
                   temp+=chars[i];
               }
            if(cnt1==cnt2){
                strs.add(temp);
                temp = "";
                cnt1 = 0;
                cnt2 = 0;
                if(i!=chars.length-1){
                    c=chars[i+1];
                }
            }
            else if(cnt1!=cnt2&&i==chars.length-1){
                temp += chars[i];
                strs.add(temp);
            }
        }
        answer = strs.size();
        
        
        return answer;
    }
}