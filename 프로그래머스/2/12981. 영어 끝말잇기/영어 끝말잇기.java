import java.util.HashSet;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        HashSet<String> usedWords = new HashSet<>(); // 등장한 단어를 저장할 Set
        usedWords.add(words[0]); // 첫 번째 단어는 미리 추가

        // 첫 번째 단어 이후로 반복
        for (int i = 1; i < words.length; i++) {
            String word = words[i];
            String prevWord = words[i - 1];

            // 1. 끝말잇기 규칙이 맞지 않는 경우
            if (prevWord.charAt(prevWord.length() - 1) != word.charAt(0)) {
                answer[0] = (i % n) + 1; // 탈락한 사람 번호
                answer[1] = (i / n) + 1; // 몇 번째 차례인지
                return answer;
            }

            // 2. 이미 등장한 단어인 경우
            if (usedWords.contains(word)) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                return answer;
            }

            // 3. 한 글자 단어인 경우 (문제에서 한 글자 단어는 인정되지 않음)
            if (word.length() == 1) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                return answer;
            }

            // Set에 단어 추가
            usedWords.add(word);
        }

        // 탈락자가 없는 경우
        return new int[]{0, 0};
    }
}
