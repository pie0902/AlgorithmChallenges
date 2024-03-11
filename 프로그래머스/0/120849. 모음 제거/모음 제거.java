class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(char i : my_string.toCharArray()){
               if(i != 'a' && i != 'e' && i != 'i' && i != 'o' && i != 'u'){
                answer = answer+ i;
            }
        }
        return answer;
    }
}