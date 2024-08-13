class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        int save = numLog[0];
        for(int i = 1; i<numLog.length; i++){
            int a = numLog[i];//0
            
            if(save + 1 == a){
                answer += 'w';
                save += 1;
            }
            else if(save - 1 == a){
                answer += 's';
                save -= 1;
            }
            else if(save + 10 == a){
                answer += 'd';
                save += 10;
            }
            else if(save - 10 == a){
                answer += 'a';
                save -= 10;
            }
            
            
            
        }
        return answer;
    }
}