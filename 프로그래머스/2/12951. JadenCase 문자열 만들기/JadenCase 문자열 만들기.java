class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(i==0&&c>='a'&&c<='z'){
                answer += Character.toUpperCase(c);
            }
            else if(i!=0&&s.charAt(i-1)==' '){
                answer += Character.toUpperCase(c);
            }
            else if(i!=0&&c>='A'&&c<='Z'){
                answer += Character.toLowerCase(c);
            }
            else{
                answer += c;
            }
        }
        return answer;
    }
}