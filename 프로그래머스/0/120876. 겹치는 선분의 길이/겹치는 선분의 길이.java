class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int max = 0;
        int min = 100;
        for (int[] i : lines) {
            for (int j : i) {
                if(max<j){
                    max = j;
                }
                if(min>j){
                    min = j;
                }
            }
        }
        for(int i = min; i<=max; i++){
            int count = 0;
            for(int[] num : lines){
                if (num[0] <= i && i < num[1]) {
                 count++;
                 System.out.println(count);
                }
            }
            if (count >= 2) {
                 answer++;
            }
        }
        
        
        
        return answer;
    }
}