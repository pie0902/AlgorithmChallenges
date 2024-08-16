import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {
        // "x"를 기준으로 문자열을 자르고 배열로 만듭니다.
        String[] tempArray = myString.split("x");

        // 빈 문자열의 개수를 세어줍니다.
        int count = 0;
        for (String s : tempArray) {
            if (!s.isEmpty()) {
                count++;
            }
        }

        // 빈 문자열을 제외한 크기의 배열을 만듭니다.
        String[] answer = new String[count];
        int index = 0;
        for (String s : tempArray) {
            if (!s.isEmpty()) {
                answer[index++] = s;
            }
        }

        // 결과 배열을 사전순으로 정렬합니다.
        Arrays.sort(answer);

        return answer;
    }
}