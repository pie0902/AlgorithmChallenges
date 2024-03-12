import java.util.Arrays;
class Solution {
    public int[] solution(String my_string) {
        
        int idx = 0;
        char[] copy = my_string.toCharArray();
        for(int i = 0; i<copy.length; i++){
            if(copy[i]<97){
                idx++;
            }
        }
        int idx2 = 0;
        int[] answer = new int[idx];
        for(char i : copy){
            if(i<97){
                answer[idx2] = i-48;
                idx2++;
            }
        }
        Arrays.sort(answer);
        System.out.println(idx);
        return answer;
    }
}