class Solution {
    public int solution(String[][] board, int h, int w) {
        int n = board.length; // board의 길이를 저장한다.
        int count = 0; //같은 색을 저장할 변수
        int[] dh = {0,1,-1,0};//높이
        int[] dw = {1,0,0,-1};//너비
        
        for(int i = 0; i<=3; i++){
            int h_check = h + dh[i];
            int w_check = w + dw[i];
            if(h_check>=0&&h_check<n){
                if(w_check>=0&&w_check<n){
                    if(board[h][w].equals(board[h_check][w_check])){
                        count++;   
                    }
                }
            }
        }
        int answer = count;
        return answer;
    }
}