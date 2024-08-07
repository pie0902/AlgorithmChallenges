import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> basket = new Stack<>();
        for(int i = 0; i<moves.length; i++){
            int m = moves[i] -1;
            for(int j = 0; j<board.length; j++){
                    if(board[j][m]!=0){
                        int doll = board[j][m];
                        board[j][m] = 0;
                        if(!basket.isEmpty()&&basket.peek()==doll){
                            basket.pop();
                            answer+=2;
                        }
                        else{
                            basket.push(doll);
                        }
                        break;
                }
            }
        }
        
        return answer;
    }
}

//[0,0,0,0,0]
//[0,0,1,0,3]
//[0,2,5,0,1]
//[4,2,4,4,2]
//[3,5,1,3,1]

