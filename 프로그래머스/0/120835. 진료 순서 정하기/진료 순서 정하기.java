import java.util.Arrays;
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] copy = Arrays.copyOf(emergency,emergency.length);
        int idx = 1;
        Arrays.sort(emergency);
        for(int i = emergency.length-1; i >=0;i--){
            for(int j = 0; j<emergency.length;j++){
                if(emergency[i]==copy[j]){
                    answer[j] = idx;
                    idx++;
                }
            }
        }
        return answer;
    }
}