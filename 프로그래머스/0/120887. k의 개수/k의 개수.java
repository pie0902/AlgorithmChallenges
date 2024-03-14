import java.util.stream.Collectors;
class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int a = i; a <=j; a++){
            String strA = String.valueOf(a);
            Long count = strA.chars().
                filter(c->c == (48 + k))
                .count();
            answer += count;
        }
        return answer;
    }
}