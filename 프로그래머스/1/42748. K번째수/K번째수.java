import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int one = commands[i][0];
            int two = commands[i][1];
            int three = commands[i][2];
            int[] subArray = Arrays.copyOfRange(array, one - 1, two);
            Arrays.sort(subArray);
            answer[i] = subArray[three - 1];
        }

        return answer;
    }
}
