class Solution {
    public String[] solution(String my_str, int n) {
        int len = (int) Math.ceil((double)my_str.length() / n); 
        String[] answer = new String[len];
        for(int i = 0; i<len; i++){
            int s = i * n;
            int e = Math.min(s+n , my_str.length());
            answer[i] = my_str.substring(s,e);
        }
        return answer;
    }
}