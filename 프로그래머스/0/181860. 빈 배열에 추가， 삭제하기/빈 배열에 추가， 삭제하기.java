import java.util.*;


class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        
        Stack<Integer> stack = new Stack<>();
        int idx = 0;
        for(boolean b : flag){
            if(b){
                for(int i = 0; i<arr[idx]*2; i++){
                    stack.push(arr[idx]);   
                }
            }
            else{
                for(int i = 0; i<arr[idx]; i++){
                    stack.pop();   
                }
            }
            idx++;
        }
        int cnt = 0;
        int[] answer = new int[stack.size()];
        for(int i : stack){
            answer[cnt] = i;
            System.out.println(i);
            cnt++;
        }
        return answer;
    }
}