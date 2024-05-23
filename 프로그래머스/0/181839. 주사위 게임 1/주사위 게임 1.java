class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        if (a % 2 != 0 && b % 2 != 0) {
            // 두 숫자가 모두 홀수인 경우
            answer = (a * a) + (b * b);
        } else if (a % 2 != 0 || b % 2 != 0) {
            // 하나는 홀수이고 다른 하나는 짝수인 경우
            answer = 2 * (a + b);
        } else {
            // 두 숫자가 모두 짝수인 경우
            answer = Math.abs(a - b);
        }
        return answer;
    }
}
