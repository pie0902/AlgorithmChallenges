class Solution {
    public int solution(String[] b) {
        String[] strs = {"aya","ye","woo","ma"};
        int answer = 0;
        for(int i = 0; i<b.length; i++){
            int strLen = 0;
            for(int j = 0; j<strs.length; j++){
                if(b[i].contains(strs[j])){
                    strLen += strs[j].length();
                }
            }
            if(b[i].length()==strLen){
                answer++;
            }
        }
        return answer;
    }
}