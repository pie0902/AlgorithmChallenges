class Solution {
    public String solution(String s) {
        String answer = "";
        int len = s.length()/2;
        if(s.length()%2 == 1){
            answer = String.valueOf(s.charAt(len));
        }
        else{
            String a= String.valueOf(s.charAt(len));
            String b= String.valueOf(s.charAt(len-1));
        answer = b+a;
        }
        return answer;
    }
}