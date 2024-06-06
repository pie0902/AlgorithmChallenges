class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String one = myString.toLowerCase();
        String two = pat.toLowerCase();
        if(one.contains(two)){
            answer = 1;   
        }
        else{
            answer = 0;
        }
        
        return answer;
    }
}