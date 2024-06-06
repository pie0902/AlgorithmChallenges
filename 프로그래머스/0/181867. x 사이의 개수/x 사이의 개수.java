class Solution {
    public int[] solution(String myString) {
        
        char[] copy = myString.toCharArray();
        int cnt = 1;
        for(char c : copy){
            if(c == 'x'){
                cnt ++;
                System.out.println(cnt);
            }
        }
        int[] answer = new int[cnt];
        
        int idx = 0;
        int len = 0;
        
        for(char c : copy){
            if(c=='x'){
                answer[idx++] = len;
                len = 0;
            }else{
                len++;   
            }
        }
        
        answer[idx] = len;
        

        return answer;
    }
}