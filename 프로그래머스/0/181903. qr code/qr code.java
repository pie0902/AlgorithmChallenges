class Solution {
    public String solution(int q, int r, String code) {
        char[] copy = code.toCharArray();
        String answer = "";
        for(int i = 0; i<copy.length;i++){
            if(i%q==r){
                answer += copy[i];   
            }
        }
        
        return answer;
    }
}