class Solution {
    public int solution(int[][] arr) {
        int answer = 0;
        for(int i = 0; i<arr.length;i++){
            for(int j = 0; j<arr[0].length;j++){
                System.out.println(arr[i][j] +":"+ arr[j][i]);
                if(arr[i][j]!=arr[j][i]){
                    return 0;
                }
            }
        }
        return 1;
    }
}