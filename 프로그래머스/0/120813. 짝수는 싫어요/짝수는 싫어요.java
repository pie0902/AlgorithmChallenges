class Solution {
    public int[] solution(int n) {
        int idx = 0;
        int index = 0;
        for(int i = 1; i <= n; i++){
            if(i%2!=0){
                index++;
            }
        }
        int[] answer = new int[index];
        
        for(int i = 1; i <= n; i++){
            if(i%2!=0){
                answer[idx] = i;
                idx++;
            }
        }        
        return answer;
    }
}