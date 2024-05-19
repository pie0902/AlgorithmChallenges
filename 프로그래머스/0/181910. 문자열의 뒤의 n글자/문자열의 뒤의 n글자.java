class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        char[] copy = my_string.toCharArray();
        
        for(int i = my_string.length()-n; i<my_string.length(); i++){
            answer += copy[i];      
        } 
        
        return answer;
    }
}