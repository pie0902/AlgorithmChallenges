class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];

        // 입력
        int x = 0;
        int y = 0;
        int iX = board[0] / 2;
        int iY = board[1] / 2;

        for (String key : keyinput) {
            switch (key) {
                case "left":
                    x = Math.max(x - 1, -iX);
                    break;
                case "right":
                    x = Math.min(x + 1, iX);
                    break;
                case "up":
                    y = Math.min(y + 1, iY);
                    break;
                case "down":
                    y = Math.max(y - 1, -iY);
                    break;
            }
        }

        answer[0] = x;
        answer[1] = y;
        return answer;
    }
}