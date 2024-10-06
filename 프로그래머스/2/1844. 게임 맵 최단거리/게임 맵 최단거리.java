import java.util.*;
class Solution {
    public int solution(int[][] map) {
        int answer = 0;
        int[][] d = {{-1,0},{1,0},{0,1},{0,-1}};
        int n = map.length;
        int m = map[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int[] temp = {0,0,1};
        queue.offer(temp);
        map[0][0] = 0;
        while(!queue.isEmpty()){
            int[] now = queue.poll();
            int row = now[0];
            int col = now[1];
            int check = now[2];
            if(row == n-1&& col ==m-1){
                return check;
            }
            for(int[] i : d){
                int nRow =row+ i[0];
                int nCol =col+ i[1];
                
                if(nRow>=0&&nRow<n&&nCol>=0&&nCol<m&&map[nRow][nCol]==1){
                    queue.offer(new int[]{nRow,nCol,check+1});
                    map[nRow][nCol] = 0;
                }   
            }
        }
        return -1;
    }
}