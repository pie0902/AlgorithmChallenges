class Solution {
    public int[][] solution(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        
        // 정사각형을 만들기 위해 row와 col 중 최대값을 구함
        int max = Math.max(row, col);
        
        // 최대값을 기준으로 정사각형 배열 생성
        int[][] answer = new int[max][max];
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                answer[i][j] = arr[i][j];
            }
        }
        
        
        return answer;
    }
}