class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] temp = new int[n+1];
        temp[0] = 1;
        temp[1] = 2;
        for(int i = 2; i<=n; i++){
            temp[i] = (temp[i-1] + temp[i-2])%1234567;
        }
 
        
        
        return temp[n-2];
    }
}