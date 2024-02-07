class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        int i = 1;
        int temp = 0;
        if(n%slice==0){
            answer = n/slice;
        }
        else{
            while(temp<n){
                temp = slice * i;
                i++;
            }
            answer = temp/slice;
        }
        
        
        return answer;
    }
}