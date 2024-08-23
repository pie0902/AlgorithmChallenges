class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for(int i = 0; i<my_string.length(); i++){
            if(my_string.charAt(i)>=97&&my_string.charAt(i)<=122){
                answer[my_string.charAt(i)-97+26]++;
            }
            if(my_string.charAt(i)<=90&&my_string.charAt(i)>=65){
                answer[my_string.charAt(i)-65]++;   
            }
                
            
        }
        return answer;
    }
}