import java.util.Arrays;

class Solution {

    static class Move {
        int[] start = new int[2];  // 시작 좌표
        int[] end = new int[2];    // 끝 좌표
        public Move(int[] start, int[] end) {
            this.start = start.clone();
            this.end = end.clone();
        }

        public int[] getStart() {
            return this.start;
        }

        public int[] getEnd() {
            return this.end;
        }
    }

    // 경로 중복 여부를 확인하는 메서드 (양방향 체크)
    public static boolean check(int[] start, int[] end, Move[] moves) {
        if (moves == null) {
            return true;
        }
        for (Move m : moves) {
            if (m == null) continue;  // null 체크 추가
            if ((Arrays.equals(m.getStart(), start) && Arrays.equals(m.getEnd(), end)) ||
                (Arrays.equals(m.getStart(), end) && Arrays.equals(m.getEnd(), start))) {
                return false;  // 이미 같은 경로를 지나갔다면 false 반환
            }
        }
        return true;
    }

    public int solution(String dirs) {
        Move[] moves = new Move[dirs.length()];
        int row = 0;
        int col = 0;
        int count = 0;

        for (int i = 0; i < dirs.length(); i++) {
            char c = dirs.charAt(i);
            int[] start = new int[]{row, col};
            int[] end = new int[2];

            // 명령어에 따른 이동
            if (c == 'U' && row + 1 <= 5) {
                end = new int[]{row + 1, col};
            } else if (c == 'D' && row - 1 >= -5) {
                end = new int[]{row - 1, col};
            } else if (c == 'R' && col + 1 <= 5) {
                end = new int[]{row, col + 1};
            } else if (c == 'L' && col - 1 >= -5) {
                end = new int[]{row, col - 1};
            } else {
                continue;  // 경계를 넘어가면 무시
            }

            // 경로가 중복되지 않는 경우에만 이동 기록
            if (check(start, end, moves)) {
                moves[count] = new Move(start, end);
                count++;
            }

            // 좌표 업데이트
            row = end[0];
            col = end[1];
        }

        return count;  // 중복되지 않은 경로의 수
    }
}
