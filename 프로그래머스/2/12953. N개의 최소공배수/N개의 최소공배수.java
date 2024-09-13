class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int z = 1;
        
        while(true){
            z++;
            int cnt = 0;
            for(int i = 0; i<arr.length; i++){
                 if(z%arr[i]==0){
                     cnt++;
                 } 
            }
            if(cnt==arr.length){
                answer = z;
                break;
            }
        }
        return answer;
    }
}