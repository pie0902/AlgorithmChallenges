class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int len1 = arr.length;
        int len2 = delete_list.length;
        int cnt = 0;
        int cnt2 = 0;
        
        for(int i = 0; i<len1;i++){
            for(int j = 0; j<len2; j++){
                if(arr[i]==delete_list[j]){
                    arr[i] = 0;
                    cnt++;
                }
            }
            System.out.println(arr[i]);
        }    
        int[] answer = new int[len1 - cnt];
        int len3 = len1-cnt;
        for(int i = 0; i <len1; i++){
            if(arr[i]!=0){
                answer[cnt2] = arr[i];
                cnt2++;
            }    
        }
        return answer;
    }
}