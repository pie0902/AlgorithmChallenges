import java.util.Stack;
class Solution {
    public int solution(String s) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        String[] copy = s.split(" ");
        for(String i : copy){    
            if(i.equals("Z")){
                if(!stack.isEmpty()){
                    answer = answer - stack.pop();
                }
            }
            else{
                int num = Integer.parseInt(i);
                stack.push(num);
                answer += num;
            }
        }
        return answer;
    }
}