import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        int cnt = 0;
        for(char i : s.toCharArray()){
            for(char j : s.toCharArray()){
                if(i==j){
                    cnt++;
                }
            }
            if(cnt == 1){
                answer += i;
            }
            cnt = 0;
        
        }
        char[] chars = answer.toCharArray();
        Arrays.sort(chars);
        String a = new String(chars);
        
        return a;
    }
}