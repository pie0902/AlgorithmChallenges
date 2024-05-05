class Solution {
    public String solution(String my_string, String alp) {
        char[] copy = my_string.toCharArray();
        for(int i = 0; i<copy.length;i++){
            if(copy[i]==alp.charAt(0)){
                copy[i] = Character.toUpperCase(copy[i]);
            }
        }
        String answer = new String(copy);
        return answer;
    }
}