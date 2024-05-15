class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int len = num_list.length;
        if(len>10){
            for(int i = 0; i<len;i++){
                answer = answer + num_list[i];
            }
        }
        if(len<=10){
            answer = 1;
            for(int i = 0; i<len; i++){
                answer = answer * num_list[i];    
            }
        }
        return answer;
    }
}