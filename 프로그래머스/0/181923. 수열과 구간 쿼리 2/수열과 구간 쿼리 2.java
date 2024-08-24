class Solution {
    public int[] solution(int[] arr, int[][] q) {
        int[] answer = new int[q.length];
        int idx = 0;       
        
        for(int i = 0; i<q.length; i++){
            int min = Integer.MAX_VALUE;
            boolean check = false;
            for(int j = q[i][0]; j<=q[i][1]; j++){
                if(arr[j]>q[i][2]){
                    check = true;
                    if(arr[j]<min){
                        min = arr[j];
                    } 
                }
            }
            if(!check){
                answer[idx] = -1;
            }
            else{
                answer[idx] = min;
            }
            idx++;
        }
        
        
        return answer;
    }
}