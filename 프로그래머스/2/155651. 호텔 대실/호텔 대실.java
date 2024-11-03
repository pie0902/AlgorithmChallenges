import java.util.*;
class Solution {
    private int convertToMinutes(String time) {
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        return hours * 60 + minutes;
    }
    
    
    public int solution(String[][] book_time) {
        
        int answer = 0;
        int[][] times = new int[book_time.length][2];
        for(int i = 0; i<book_time.length; i++){
            times[i][0] = convertToMinutes(book_time[i][0]);
            times[i][1] = convertToMinutes(book_time[i][1]) + 10;
        }
        Arrays.sort(times,(a,b)->Integer.compare(a[0],b[0]));
        PriorityQueue<Integer> ret = new PriorityQueue<>();
        
        for(int[] time : times){
            int start = time[0];
            int end = time[1];
            if(!ret.isEmpty()&&ret.peek()<=start){
                ret.poll();   
            }
            ret.offer(end);  
        }
        
        answer = ret.size();
        return answer;
    }
}