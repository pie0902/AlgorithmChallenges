class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int sum = a;
        if(included[0]){
            answer += sum;
        }
        for(int i = 1; i<included.length;i++){
            sum+=d;
            if(included[i]){
                answer += sum;    
            }
            
        }
        return answer;
    }
}