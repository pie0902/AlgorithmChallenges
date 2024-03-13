class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt1 = 0;
        int cnt2 = 0;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                if(i%j==0){
                    cnt2 ++;
                }
            }
            if(cnt2>=3){
                cnt1++;
                cnt2 = 0;
            }
            cnt2=0;
        }
        answer = cnt1;
        return answer;
    }
}