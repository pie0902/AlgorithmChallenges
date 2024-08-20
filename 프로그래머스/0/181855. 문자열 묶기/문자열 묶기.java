import java.util.*;

class Solution {
    
    public int solution(String[] strArr) {
        int answer = 0;
        int[] count = new int[31]; // 문자열 길이는 최대 30이므로 31개의 슬롯이 필요

        // 한 번의 순회로 모든 길이의 문자열 개수를 계산
        for (String str : strArr) {
            count[str.length()]++;
        }

        // 최대 개수를 찾기
        for (int i = 1; i < count.length; i++) {
            if (count[i] > answer) {
                answer = count[i];
            }
        }

        return answer;
    }
}