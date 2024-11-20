import java.util.*;

class Solution {
    public int solution(int n, int k, int[] enemy) {
        // 최대 힙 생성
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int answer = 0;

        for (int i = 0; i < enemy.length; i++) {
            // 현재 라운드의 적 추가
            maxHeap.add(enemy[i]);
            
            // 병사가 부족하면 무적권 사용
            n -= enemy[i];
            if (n < 0) {
                if (k > 0) {
                    // 무적권 사용: 가장 큰 적을 제거
                    n += maxHeap.poll();
                    k--;
                } else {
                    // 무적권도 없고 병사도 부족하면 게임 종료
                    break;
                }
            }
            answer++;
        }
        return answer;
    }
}
