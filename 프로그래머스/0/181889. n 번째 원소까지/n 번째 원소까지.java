class Solution {
    public int[] solution(int[] num_list, int n) {
        int len = num_list.length;
        int[] answer = new int[n];
        for(int i = 0; i< len; i++){
            if(i==n){
                break;
            }
            else{
                answer[i] = num_list[i];
            }
        }
        return answer;
    }
}