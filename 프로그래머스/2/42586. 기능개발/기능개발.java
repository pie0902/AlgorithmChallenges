import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i<speeds.length; i++){
            int cnt = 0;
            while(progresses[i]<100){
                progresses[i] += speeds[i];
                cnt++;
            }
            q.offer(cnt);
        }
        
        int a = q.poll();
        int count = 1;

        while(!q.isEmpty()){
            int b = q.peek();
            if(a>=b){
                q.poll();
                count++;
            }
            else{
                list.add(count);
                a = q.poll();
                count = 1;
            }
        }
        
        
        list.add(count);
        
        
        int[] answer = new int[list.size()];
        for(int i = 0; i<list.size(); i++){
            answer[i] = list.get(i);   
        }
        return answer;
    }
}