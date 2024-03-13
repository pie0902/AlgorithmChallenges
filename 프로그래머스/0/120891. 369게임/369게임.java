import java.util.stream.Collectors;
class Solution {
    public int solution(int order) {
        int answer = 0;
        String s = String.valueOf(order);
        System.out.println(order);
        answer = (int)s.chars().
            filter(c->c=='3'||c=='6'||c=='9')
            .count();
        return answer;
    }
}