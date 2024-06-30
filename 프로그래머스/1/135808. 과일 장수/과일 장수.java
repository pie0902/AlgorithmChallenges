import java.util.Arrays;
class Solution {
    public int solution(int k, int m, int[] score) {
        //사과 최고점수 = k
        //사과 개수 = m
        //[1,1,1,2,2,3,3]
        //
        int answer = 0;
        int temp = 0;
        Arrays.sort(score);
        int len = score.length-m;
        for(int i = 0; i < score.length/m; i ++){
            // i = 0; i < 4 ; i ++;
            // len = 12 - 3 = 9
            // len = 9 - 3 = 6
            answer = answer + (score[len] * m);
            //0 = 0 + 2 * 1
            len = len - m;
        }
        //[1,1,2,2,2,2,4,4,4, 4,4,4]
        
        return answer;
    }
}