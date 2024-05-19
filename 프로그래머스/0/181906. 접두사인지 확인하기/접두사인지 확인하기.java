class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        int cnt = 0;
        int len1 = my_string.length();
        int len2 = is_prefix.length();
        
        char[] s = my_string.toCharArray();
        char[] pr = is_prefix.toCharArray();
        
        if(len1<len2){
            answer = 0;
        }
        else{
            for(int i = 0; i<len2; i++){ 
                if(s[i]==pr[i]){
                    cnt++; 
                }
            }
            if(len2==cnt){
                answer =1;
            }
        }
        
        
        
        
        
        return answer;
    }
}