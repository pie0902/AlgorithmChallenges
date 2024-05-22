class Solution {
    public int[] solution(int[] num_list) {
        int len = num_list.length;
        int newa = 0;
        int[] answer = new int[len+1];
        if(num_list[len-2] < num_list[len-1]){
            newa = num_list[len-1] - num_list[len-2];
        } else {
            newa = num_list[len-1] * 2;
        }
        
        for(int i = 0; i<len;i++){
            answer[i] = num_list[i];
        }
        answer[len] = newa;
        
        
        return answer;
    }
}

