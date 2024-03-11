class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        for(char i : my_string.toCharArray()){
            if(i != letter.charAt(0)){
                answer = answer + i;
            }
        }
        return answer;
    }
}