class Solution {
    public int[] solution(int[] arr, int[][] arr2) {
        
        int len1 = arr2[0][1]-arr2[0][0] + 1;
        int len2 = arr2[1][1]-arr2[1][0] + 1;
        int[] answer = new int[len1+len2];
        int idx=0;
        for(int i = arr2[0][0];i<=arr2[0][1];i++){
            answer[idx] = arr[i];
            System.out.println(arr[i]);
            idx++;
        }
        for(int i = arr2[1][0];i<=arr2[1][1];i++){
            answer[idx] = arr[i];
            System.out.println(arr[i]);
            idx++;
        }
        
        System.out.println(len1 + " " + len2);
        
        
        
        
        
        
        return answer;
    }
}