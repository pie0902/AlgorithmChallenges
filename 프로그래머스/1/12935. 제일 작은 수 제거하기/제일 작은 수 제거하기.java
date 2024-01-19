class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];

        int cnt = 0;
        if(arr.length==1){
            int[] minus = {-1};
            return minus;
        }
        int min = Integer.MAX_VALUE;
        for (int i=0; i<arr.length; i++){
            min = Math.min(min, arr[i]);
        }
        for(int i = 0; i<arr.length;i++){
            if(arr[i]==min){
                continue;
            }            
            else{
                answer[cnt]=arr[i];
                cnt++;
            }
        }
        
        return answer;
    }
}