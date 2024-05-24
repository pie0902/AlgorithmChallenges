class Solution {
    public int solution(String num_str) {
        int answer = 0;
        char[] copy = num_str.toCharArray();
        for(int i = 0; i< num_str.length(); i++){
            answer = answer + (int)copy[i] -'0';
        }
        return answer;
    }
}