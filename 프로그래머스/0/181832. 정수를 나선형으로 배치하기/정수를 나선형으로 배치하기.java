class Solution {
    public int[][] solution(int n) {
        int[][] a = new int[n][n];
        int left = 0;
        int right = n;
        int top = 0;
        int bottom = n;
        int cnt = 1;
        while(left<right){
            //왼쪽->오른쪽
            for(int i = left; i<right; i++){
                //System.out.println(cnt + " ");
                a[top][i] = cnt;
                cnt++;
            }
            top++;
            for(int i = top; i<bottom; i++){
                a[i][right-1] = cnt;
                cnt++;
            }
            right--;
            for(int i = right-1; i>=left; i--){
                a[bottom-1][i] = cnt;
                cnt++;
            }
            bottom--;
            for(int i = bottom-1; i>=top; i--){
                a[i][left] = cnt++;
            }
            left++;
        }
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        return a;
    }
}