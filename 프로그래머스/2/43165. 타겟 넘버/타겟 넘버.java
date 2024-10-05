import java.util.*;


class Solution {
    static class Temp{
        int sum;
        int index;
        public Temp(int a, int b){
            this.sum = a;
            this.index = b;
        }
    }


    public int solution(int[] numbers, int target) {
        //넓이 우선 탐색
        Queue<Temp> queue = new LinkedList<>();
        queue.offer(new Temp(0,0));
        int answer = 0;
        
        
        while(!queue.isEmpty()){
            Temp now = queue.poll();
            int sum = now.sum;
            if(now.index == numbers.length){
                if(now.sum==target){
                    answer++;
                }
                continue;
            }
            queue.offer(new Temp(now.sum+numbers[now.index],now.index+1));    
            queue.offer(new Temp(now.sum-numbers[now.index],now.index+1));
        }
        return answer;
    }
}