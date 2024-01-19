class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int cnt = 0;
        for(int i = left ; i<=right; i++){
            for(int j = 1; j<=i; j++){
                if(i%j==0){
                    cnt++;
                }
            }
            if(cnt%2 == 0){
                answer = answer + i;
                System.out.println("짝수"+answer);    
            }
            else if(cnt%2==1){
                answer = answer -i;
                System.out.println("홀수"+answer);    
            }
            
            cnt=0;
            
        }
        return answer;
    }
}