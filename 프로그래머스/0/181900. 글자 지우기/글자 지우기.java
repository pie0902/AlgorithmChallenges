class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        boolean[] b = new boolean[my_string.length()];
        for(int i = 0; i<indices.length;i++){
            b[indices[i]] = true;   
        }
        int idx = 0;
        for(boolean z : b){
            if(z==false){
                answer+=my_string.charAt(idx);
            }
            idx++;
        }
        return answer;
    }
}