class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder answer = new StringBuilder();
        
        for (int i = 0; i < my_string.length(); i += m) {
            // 각 줄의 시작 인덱스에서 m개 만큼 잘라서 temp에 저장
            String temp = my_string.substring(i, Math.min(i + m, my_string.length()));
            // 해당 줄에서 c번째 문자를 answer에 추가
            answer.append(temp.charAt(c - 1));
        }
        
        return answer.toString();
    }
}