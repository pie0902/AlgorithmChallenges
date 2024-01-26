class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);

            if (a != ' ') {
                if (a >= 'A' && a <= 'Z') {
                    a = (char) ((a - 'A' + n) % 26 + 'A');
                } else if (a >= 'a' && a <= 'z') {
                    a = (char) ((a - 'a' + n) % 26 + 'a');
                }
            }

            answer += a;
        }
        return answer;
    }
}
