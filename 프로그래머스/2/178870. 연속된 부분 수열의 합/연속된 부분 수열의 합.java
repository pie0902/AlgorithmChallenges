class Solution {
    public int[] solution(int[] s, int k) {
        int[] answer = new int[2];
        int start = 0;
        int end = 0;
        int sum = s[start];
        int min = Integer.MAX_VALUE;
        int len = 0;
        while(end<s.length){
            
            if(sum<k){
                end++;
                if(end<s.length){
                    sum += s[end];    
                }
                
            }
            else if(sum>k){
                sum -= s[start];
                start++;
            }
            else{
                len = end - start;
                if(len<min){
                    min = len;
                    answer[0] = start;
                    answer[1] = end;
                }
                sum -= s[start];
                start++;
            }
        }
        
        
        return answer;
    }
}