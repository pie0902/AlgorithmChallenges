class Solution {
    public int solution(int n) {
        int answer = 0;
        while(n!=0){
            answer = answer + n%10;
            System.out.println(answer);
            n = n/10;
            System.out.println(n);
            
            
        }
        return answer;
    }
}