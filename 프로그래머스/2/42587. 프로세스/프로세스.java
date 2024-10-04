import java.util.*;
class Solution {
    static class Idx implements Comparable<Idx>{
        int value;
        int index;
        public Idx(int a, int b){
            this.value = a;
            this.index = b;
        }
        @Override
        public int compareTo(Idx other){
           return Integer.compare(this.value,other.value);
        }
    }
    
    
    
    public int solution(int[] p, int location) {
        int answer = 0;
        Queue<Idx> run = new LinkedList<>(); 
        Queue<Idx> wait= new LinkedList<>();
        //대기 큐에 모든 숫자를 넣는다.
        for(int i = 0; i<p.length; i++){
            wait.offer(new Idx(p[i],i));   
        }
        //대기 큐가 비면 종료
        while(!wait.isEmpty()){
            Idx now = wait.poll();
            boolean check = true;
            for(Idx i : wait){
                if(now.value<i.value){
                    wait.offer(now);
                    check = false;
                    break;
                }
            }
            if(check){
                run.offer(now);
            }
        }
        int idx = 0;
        for(Idx i : run){
            if(i.index == location){
                answer = idx;   
            }
            idx++;
        }
        return answer+1;
    }
}