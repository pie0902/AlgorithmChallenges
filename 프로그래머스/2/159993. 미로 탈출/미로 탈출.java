import java.util.*;
class Solution {
    public static boolean check(int nRow,int nCol,boolean[][] v, char[][] c){
        return nRow >= 0 && nCol >= 0 && nRow < c.length && nCol < c[0].length && c[nRow][nCol] != 'X' && !v[nRow][nCol];
    }
    
    public static int[] bfs(int sRow,int sCol,char[][] c,char target){
        int[] rowMove = {1,-1,0,0};
        int[] colMove = {0,0,-1,1};
        boolean[][] v = new boolean[c.length][c[0].length];
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{sRow,sCol,0});
        v[sRow][sCol] = true;
        while(!q.isEmpty()){
            int[] now = q.poll();
            int row = now[0];
            int col = now[1];
            int cnt = now[2];
            if(c[row][col]==target){
                return new int[]{row,col,cnt};
            }
            for(int i = 0; i<4; i++){
                int newRow = row + rowMove[i];
                int newCol = col + colMove[i];
                if(check(newRow,newCol,v,c)){
                    v[newRow][newCol] = true;
                    int[] newPoint = {newRow,newCol,cnt+1};
                    q.offer(newPoint);
                }
            }
        }
        return new int[]{-1,-1,-1};
    }
    
    
    public int solution(String[] m) {
        int answer = 0;
        char[][] c = new char[m.length][m[0].length()];
        boolean[][] v = new boolean[m.length][m[0].length()];
        int row=0,col=0;
        for(int i = 0; i<m.length; i++){
            for(int j = 0; j<m[0].length(); j++){
                c[i][j] = m[i].charAt(j);
                if(c[i][j] == 'S'){
                    row = i;
                    col = j;
                } 
            }
        }
        int[] lever = bfs(row,col,c,'L');
        if(lever[0] == -1){
            return -1;
        }
        int[] exit = bfs(lever[0],lever[1],c,'E');
        if(exit[0] == -1){
            return -1;
        }
        answer = lever[2]+exit[2];
        return answer;
    }
}