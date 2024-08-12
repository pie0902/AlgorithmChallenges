import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        
        char[] copy = my_string.toCharArray();
        int idx = 0;
        for(int i = 0; i<copy.length;i++){
            String temp = "";
            for(int j = i; j<copy.length; j++){
                temp = temp + copy[j];
            }
            answer[idx] = temp;
            idx++;
        }
        Arrays.sort(answer);
        return answer;
    }
}