class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(char i : my_string.toCharArray()){
            System.out.println((int)i);
            if((int)i >=97){
                answer = answer + (char)(i - 32);
            }
            else{
                answer = answer + (char)(i + 32);
            }
        }
        return answer;
    }
}