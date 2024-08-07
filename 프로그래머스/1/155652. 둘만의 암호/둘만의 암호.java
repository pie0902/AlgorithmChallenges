class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        for(int i = 0; i<s.length(); i++){
            char temp = s.charAt(i);
            int steps = 0;
            //알파벳 더하기
            while(steps<index){
                temp++;
                if(temp>'z'){
                    temp='a';
                }
            //skip에 포함되는지
            boolean check = false;
            for(int k = 0; k<skip.length();k++){
                if(temp ==skip.charAt(k)){
                    check = true;
                    break;
                }
            }
            if(!check){
                steps++;
            }              
        }  
        answer+=temp;
    }
        return answer;
}
}