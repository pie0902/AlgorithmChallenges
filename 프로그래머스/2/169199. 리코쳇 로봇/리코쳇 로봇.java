import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(String[] board) {
        int rows = board.length;
        int cols = board[0].length();
        char[][] grid = new char[rows][cols];
        boolean[][] visited = new boolean[rows][cols];
        int startRow = 0, startCol = 0;

        // 문자열 배열을 2D 문자 배열로 변환
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = board[i].charAt(j);
                if (grid[i][j] == 'R') {
                    startRow = i;
                    startCol = j;
                }
            }
        }

        // BFS 구현
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{startRow, startCol, 0}); // {row, col, moves}
        visited[startRow][startCol] = true;

        // 방향 벡터 (상, 하, 좌, 우)
        int[] rowMove = {-1, 1, 0, 0};
        int[] colMove = {0, 0, -1, 1};

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int row = current[0];
            int col = current[1];
            int moves = current[2];

            // 목표 지점에 도달하면 이동 횟수 반환
            if (grid[row][col] == 'G') {
                return moves;
            }

            // 4방향 탐색
            for (int i = 0; i < 4; i++) {
                int newRow = row;
                int newCol = col;

                // 현재 방향으로 미끄러짐
                while (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols
                        && grid[newRow][newCol] != 'D') {
                    newRow += rowMove[i];
                    newCol += colMove[i];
                }

                // 장애물이나 경계를 넘었으므로 한 칸 뒤로 이동
                newRow -= rowMove[i];
                newCol -= colMove[i];

                // 새로운 위치가 아직 방문되지 않았으면 큐에 추가
                if (!visited[newRow][newCol]) {
                    visited[newRow][newCol] = true;
                    queue.offer(new int[]{newRow, newCol, moves + 1});
                }
            }
        }

        // 목표 지점에 도달할 수 없는 경우
        return -1;
    }
}
