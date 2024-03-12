class Solution {
    public int[] solution(int n, int[] numlist) {
        int idx = 0;
        int idx2 = 0;
        for(int i : numlist){
            if(i%n==0){
                idx++;
            }
        }
        int[] answer =new int[idx];
        for(int i : numlist){
            if(i%n==0){
                answer[idx2]=i;
                idx2++;
            }
        }
        
        return answer;
    }
}