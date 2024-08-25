class Solution {
    public String solution(String code) {
        boolean mode = false;
        String answer = "";
        int cnt = 0;
        for(int i = 0; i<code.length(); i++){
            if(code.charAt(i)=='1'){
                if(cnt%2==0){
                    mode = true;
                    cnt++;
                }else{
                    mode = false;
                    cnt++;
                }
            }else{
                if(!mode){
                    if(i%2==0){
                        answer += code.charAt(i);
                    }
                }
                else{
                    if(i%2!=0){
                        answer += code.charAt(i);                       
                    }
                }
            }
        }
        if(answer.equals("")){
            return "EMPTY";
        }
        
        return answer;
    }
}