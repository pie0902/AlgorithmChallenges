class Solution {
    boolean solution(String s) {
        int cnt = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                cnt++; // 여는 괄호면 카운트를 증가
            } else {
                cnt--; // 닫는 괄호면 카운트를 감소
            }

            if (cnt < 0) {
                return false;
            }
        }

        // 모든 괄호를 처리하고 나서 0이면 올바른 괄호
        return cnt == 0;
    }
}
