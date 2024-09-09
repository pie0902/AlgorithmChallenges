class Solution {
    public int solution(int n) {
        if(n<3){
            return 1;
        }
        int answer = 0;
        int z = 1;
        while(z<=n/2+1){
            int sum = 0;
            for(int i = z; i<=n/2+1; i++){
                sum = sum + i;
                if(sum==n){
                    answer++;
                    break;
                }
                if(sum>n){
                    break;
                }
            }
            z++;
            
        }
        return answer+1;
    }
}