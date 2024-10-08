import java.util.*;

class Solution {
    public int[] solution(int[] n) {
        int[] answer = new int[n.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = n.length-1; i>=0; i--){
            while(!stack.isEmpty()&&stack.peek()<=n[i]){
                stack.pop();
            }
                if(stack.isEmpty()){
                    answer[i] = -1;
                }
                else{
                    answer[i] = stack.peek();
                }
            
            stack.push(n[i]);
        }
        return answer;
    }
}