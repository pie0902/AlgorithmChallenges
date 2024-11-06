import java.util.*;
class Solution {
    public static boolean vv(char[][] c, int row, int col,boolean v[][]){
        return row>=0&&row<c.length&&col>=0&&col<c[0].length&&!v[row][col]&&c[row][col]!='X';
    }
    
    
    public static int bfs(int row,int col,char[][] c, boolean v[][]){
        int sum = 0;
        sum += Integer.parseInt(String.valueOf(c[row][col]));;
        int[] rowMove = {1,-1,0,0};
        int[] colMove = {0,0,-1,1};
        Queue<int[]> q = new LinkedList<>();
        v[row][col] = true;
        q.offer(new int[]{row,col});
        while(!q.isEmpty()){
            int[] now = q.poll();
            int nRow = now[0];
            int nCol = now[1];
            for(int i = 0; i<4; i++){
                int newRow = nRow + rowMove[i];
                int newCol = nCol + colMove[i];
                if(vv(c,newRow,newCol,v)){
                    v[newRow][newCol] = true;
                    q.offer(new int[]{newRow,newCol});
                    sum += Integer.parseInt(String.valueOf(c[newRow][newCol]));
                }
            }
        }
        return sum;
    }
    
    
    public int[] solution(String[] m) {
        //bfs로 방문한곳 표시하면서 섬 몇개인지
        //그리고 그 결과들을 모아서 정렬
        
        char[][] c = new char[m.length][m[0].length()];
        boolean[][] v = new boolean[m.length][m[0].length()];
        for(int i = 0; i<m.length; i++){
            for(int j = 0; j<m[0].length(); j++){
                c[i][j] = m[i].charAt(j);
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<c.length; i++){
            for(int j = 0; j<c[0].length; j++){
                if(c[i][j]!='X'&&!v[i][j]){
                    list.add(bfs(i,j,c,v));
                }
            }
        }
        if(list.isEmpty()){
            return new int[]{-1};
        }
        int[] answer = new int[list.size()];
        int idx = 0;
        for(int i : list){
            answer[idx++] = i;
        }
        Arrays.sort(answer);
        
        
        return answer;
    }
}