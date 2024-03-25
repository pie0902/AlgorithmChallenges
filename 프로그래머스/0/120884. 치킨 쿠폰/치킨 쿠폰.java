class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int coupon = chicken;

        while (coupon >= 10) {
            int exchanged = coupon / 10;
            answer += exchanged;
            coupon = exchanged + (coupon % 10);
        }

        return answer;
    }
}