import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        Queue<String> c1 = new LinkedList<>();
        Queue<String> c2 = new LinkedList<>();
        c1.addAll(Arrays.asList(cards1));
        c2.addAll(Arrays.asList(cards2));
        for(int i = 0; i<goal.length;i++){
            if(!c1.isEmpty() && c1.peek().equals(goal[i])){
                c1.poll();
            }
            else if(!c2.isEmpty() && c2.peek().equals(goal[i])){
                c2.poll();
            }
            else{
                answer = "No";
                return answer;
            }
        }
        answer = "Yes";
        return answer;
    }
}
        
