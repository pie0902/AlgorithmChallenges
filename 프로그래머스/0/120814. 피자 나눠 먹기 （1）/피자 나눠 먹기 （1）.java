class Solution {
    public int solution(int n) {
        int answer = 0;
        int piece = 7;
        if(n<=7){
            answer = 1;
        }
        else{
            while(piece<n){
                piece = piece + 7;
            }
            answer = piece/7;
        }
        return answer;
    }
}