import java.util.LinkedHashSet;
import java.util.Set;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        Set<Character> set = new LinkedHashSet<>();
        for(char i : my_string.toCharArray()){
            set.add(i);
        }
        for(char i : set){
            answer = answer + i;
        }
        return answer;
    }
}