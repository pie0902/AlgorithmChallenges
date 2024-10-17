import java.util.*;
class Solution {
    public int solution(int[] order) {
        int answer = 0;
        Queue<Integer> box = new LinkedList<>();
        Stack<Integer> wait = new Stack<>();
        int[] copy = order.clone();
        Arrays.sort(copy);
        int idx = 0;
        for(int i : copy){
            box.offer(i);
        }
        while(!box.isEmpty()){
            int now = box.poll();
            if(now != order[idx]){
                while(!wait.isEmpty()&&wait.peek()==order[idx]){
                    wait.pop();
                    answer++;
                    idx++;
                }
                
                if(now != order[idx]){
                    wait.push(now);
                }else{
                    answer++;
                    idx++;
                }
            }else{
                answer++;
                idx++;
            }
            
            
            
        }
        
        
        while(!wait.isEmpty()){
            if(wait.peek() == order[idx]){
                wait.pop();
                answer++;
                idx++;
            } else {
                // 순서가 맞지 않으면 더 이상 처리하지 않음
                break;
            }
        }
        return answer;
    }
}