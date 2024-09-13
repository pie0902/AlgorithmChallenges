import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);  // 몸무게를 오름차순으로 정렬
        int light = 0;  // 가벼운 사람의 인덱스
        int heavy = people.length - 1;  // 무거운 사람의 인덱스
        int answer = 0;  // 필요한 보트 개수
        
        while (light <= heavy) {
            // 가장 가벼운 사람과 가장 무거운 사람을 함께 태울 수 있으면
            if (people[light] + people[heavy] <= limit) {
                light++;  // 가벼운 사람도 태움
            }
            // 무거운 사람은 보트에 태움
            heavy--;
            answer++;  // 보트 하나 추가
        }
        
        return answer;
    }
}
