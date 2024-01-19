class Solution {
    public String solution(String s) {
        String answer = "";
        int cnt = 0;
        for(int i = 0; i<s.length();i++){
            char cha = s.charAt(i);
            
            if(cha ==' '){
                cnt = 0;
                answer = answer + cha;
            }
            else{
                if(cnt%2==0){
                    answer = answer + Character.toUpperCase(cha);
                }
                else{
                    answer = answer + Character.toLowerCase(cha);
                }
                cnt++;
            }
        }
        return answer;
    }
}