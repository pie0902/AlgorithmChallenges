class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String s = String.valueOf(x);
        
        int sum = 0;
        for(int i = 0; i<s.length();i++){
            sum = sum + s.charAt(i)-48;
        }
        if(x % sum == 0){
            answer = true;
        }
        else{
            answer = false;
        }
        return answer;
    }
}