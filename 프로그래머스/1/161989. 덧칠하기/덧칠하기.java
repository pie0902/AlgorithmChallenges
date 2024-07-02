class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int start = 0;
        for(int i = 0; i<section.length; i++){
            if(section[i]>start){
            // 2 > 0
            // 3 > 5
            // 6 > 5
                answer++;
                //1
                //2
                start = section[i] + m - 1;
                //5 = 2 + 4 -1
                //9 = 6 + 4 -1
            }
        }
        return answer;
    }
}