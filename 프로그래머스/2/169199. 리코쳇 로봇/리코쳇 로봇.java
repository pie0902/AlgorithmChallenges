import java.util.*;
class Solution {
    public int solution(String[] b) {
        if (b == null || b.length == 0 || b[0].length() == 0) {
            return -1; // 잘못된 입력
        }
        Queue<int[]> q = new LinkedList<>();
        char[][] c = new char[b.length][b[0].length()];
        int[] point = new int[3];
        boolean found = false;
        for(int i = 0; i<b.length; i++){
            for(int j = 0; j<b[0].length(); j++){
                c[i][j] = b[i].charAt(j);
                if(c[i][j]=='R'){
                    point[0] = i;
                    point[1] = j;
                    found = true;
                }
            }
        }
        if(!found){
            return -1;
        }
        int cnt = 0;
        point[2] = cnt;
        q.offer(point);
        boolean[][] v = new boolean[b.length][b[0].length()];
        v[point[0]][point[1]] = true;
        int[] rowMove = {1, -1, 0, 0};
        int[] colMove = {0, 0, -1, 1};     
        while(!q.isEmpty()){
            int[] now = q.poll();
            int row = now[0];
            int col = now[1];
            int step = now[2];
            if(c[row][col]=='G'){
                return step;
            }
            for(int i = 0; i<4; i++){
                int newRow = row;
                int newCol = col;
                while(newRow>=0&&newRow<b.length&&newCol>=0&&newCol<b[0].length()&&c[newRow][newCol]!='D'){
                    newRow += rowMove[i];
                    newCol += colMove[i];
                }
                newRow -= rowMove[i];
                newCol -= colMove[i];
                if(!v[newRow][newCol]){
                    v[newRow][newCol] = true;
                    q.offer(new int[]{newRow,newCol,step + 1});
                }
            }
        }
        
        
        return -1;
    }
}