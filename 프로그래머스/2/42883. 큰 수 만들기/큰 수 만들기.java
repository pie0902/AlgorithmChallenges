class Solution {
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        int len = number.length()-k;
        for(char c : number.toCharArray()){
            while(k>0&&answer.length()>0&&answer.charAt(answer.length()-1)<c){
                answer.deleteCharAt(answer.length()-1);
                k--;
            }
            answer.append(c);
        }
        return answer.substring(0,len);
    }
}