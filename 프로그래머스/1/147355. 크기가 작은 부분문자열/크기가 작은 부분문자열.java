class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int len = t.length()-p.length()+1;
        long pLong = Long.parseLong(p);
        
        for(int i = 0; i<len;i++){
            String temp = t.substring(i , i+p.length());
            if(Long.parseLong(temp)<=pLong){
                answer++;
            }
        }
        
        return answer;
    }
}