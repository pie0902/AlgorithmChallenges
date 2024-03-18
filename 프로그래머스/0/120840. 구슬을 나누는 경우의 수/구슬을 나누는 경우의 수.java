class Solution {
    public long f(int a, int b){
        long num = 1;
        b = Math.min(b,a-b);
        
        for(int i = 1; i<=b; i++,a--){
            num = num * a;
            num = num / i;
        }
        return num;
    }
    public long solution(int balls, int share) {
        long answer = f(balls,share);
        return answer;
    }
    
}