import java.util.*;

class Solution {
    public static class Stage {
        int number;
        double failRate;

        public Stage(int number, double failRate) {
            this.number = number;
            this.failRate = failRate;
        }
    }

    public int[] solution(int N, int[] stages) {
        int[] stageCount = new int[N + 2];
        for (int stage : stages) {
            stageCount[stage]++;
        }

        int totalPlayers = stages.length;
        List<Stage> stageList = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            double failRate = 0;
            if (totalPlayers > 0) {
                failRate = (double) stageCount[i] / totalPlayers;
            }
            stageList.add(new Stage(i, failRate));
            totalPlayers -= stageCount[i];
        }

        stageList.sort((a, b) -> Double.compare(b.failRate, a.failRate) != 0 ?
                Double.compare(b.failRate, a.failRate) : Integer.compare(a.number, b.number));

        return stageList.stream().mapToInt(s -> s.number).toArray();
    }
}