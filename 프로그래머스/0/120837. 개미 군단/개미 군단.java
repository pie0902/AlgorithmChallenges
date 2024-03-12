class Solution {
    public int solution(int hp) {
        int answer = 0;
        int[] attacks = {5, 3, 1};

        for (int attack : attacks) {
            answer += hp / attack;
            hp %= attack;
        }

        return answer;
    }
}
