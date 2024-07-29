import java.util.Arrays;
class Solution {
    public String solution(String[] p, String[] c) {
        String answer = "";
        Arrays.sort(p);
        Arrays.sort(c);
        for(int i = 0; i <c.length; i++){
            if(!p[i].equals(c[i])){
                answer = p[i];
                return answer;
            }
        }
        answer = p[p.length-1];
        return answer;
    }
}