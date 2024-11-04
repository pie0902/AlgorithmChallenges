import java.util.*;
class Solution{
    static class Point {
        int row,col,d;
        public Point(int row,int col, int d){
            this.row = row;
            this.col = col;
            this.d = d;
        }
    }
    public static boolean isValid(int row, int col, char[][] maze, boolean[][] visited){
        return row>=0&&col>=0&&row<maze.length&&col<maze[0].length&&maze[row][col]!='X'&& !visited[row][col];
    }
    public static int bfs(char[][] maze,int startRow, int startCol, char target){
        int[] rowMove = {1,-1,0,0};
        int[] colMove = {0,0,-1,1};
        boolean[][] visited = new boolean[maze.length][maze[0].length];
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(startRow,startCol,0));
        visited[startRow][startCol] = true;
        while(!queue.isEmpty()){
            Point now = queue.poll();
            if(maze[now.row][now.col]==target){
                return now.d;
            }
            for(int i = 0; i<4; i++){
                int newRow = now.row + rowMove[i];
                int newCol = now.col + colMove[i];
                if(isValid(newRow,newCol,maze,visited)){
                    visited[newRow][newCol] = true;
                    queue.add(new Point(newRow,newCol,now.d+1));   
                }
            }
        }
        return -1;
    }
    
    
    
    
    
    
    
    
    public int solution(String[] maps) {
        int startRow = 0, startCol = 0;
        int leverRow = 0, leverCol = 0;
        int exitRow = 0, exitCol = 0;
        char[][] maze = new char[maps.length][maps[0].length()];
        for(int i = 0; i<maps.length; i++){
            for(int j = 0; j<maps[0].length(); j++){
                maze[i][j] = maps[i].charAt(j);
                if(maze[i][j]=='S'){
                    startRow = i;
                    startCol = j;
                }
                else if(maze[i][j] == 'L'){
                    leverRow = i;
                    leverCol = j;
                }
                else if(maze[i][j] == 'E'){
                    exitRow = i;
                    exitCol = j;
                }
            }
        }
        // 시작 지점에서 레버까지 최단 거리
        int toLever = bfs(maze, startRow, startCol, 'L');
        if (toLever == -1) return -1;

        // 레버에서 출구까지 최단 거리
        int toExit = bfs(maze, leverRow, leverCol, 'E');
        if (toExit == -1) return -1;

        return toLever + toExit;
    }
}