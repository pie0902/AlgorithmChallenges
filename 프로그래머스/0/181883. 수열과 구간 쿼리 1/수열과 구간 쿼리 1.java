class Solution {
    public int[] solution(int[] arr, int[][] q) {
        for(int i = 0; i<q.length;i++){ 
            for(int j = q[i][0]; j<=q[i][1]; j++){
                  arr[j] += 1;
            }
        }
        return arr;
    }
}