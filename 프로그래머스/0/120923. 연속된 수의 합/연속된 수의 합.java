class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int sum = 0;
        int idx = 0;
        for(int i = -100; i<=total; i++){
            for(int j = i; j<i+num;j++){
                sum = sum + j;
                System.out.println(sum);
            }
            if(sum == total){
                idx = i;
                System.out.println("킼킼" + sum + "킼킼" + i);
            }
            System.out.println();
            sum = 0;
        }
        for(int i = idx; i<idx+num;i++){
            answer[sum] = i;
            sum++;
        }
        
        
        
        return answer;
    }
}