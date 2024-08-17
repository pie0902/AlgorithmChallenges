class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String copy = "";
        char[] c = my_string.toCharArray();
        for(int i = e; i>=s; i--){
            copy += c[i];   
        }
        
        answer += my_string.substring(0,s);
        answer += copy;
        answer += my_string.substring(e+1,my_string.length());
        return answer;
    }
}