class Solution {
    public int solution(int n) {
        int answer = 1;
        int test = 10;
        int temp = 0;
        for(int i = 1 ; i<=test; i++){
            for(int j = 1; j<=i; j++){
                answer = answer * j;
            }
            System.out.println(i +"i와 앤서" +answer);
            if(answer > n){
                System.out.println(i +"i와 앤서2" +answer);
                answer = i - 1;
                break;
            }
            else if(answer == n){
                answer = i;
                break;
            }
            answer = 1;
        }
        return answer;
    }
}