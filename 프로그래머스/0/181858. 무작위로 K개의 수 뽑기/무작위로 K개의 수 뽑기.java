import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        Set<Integer> uniqueNumbers = new LinkedHashSet<>();  // 순서를 유지하면서 중복을 제거하는 Set

        for (int num : arr) {
            if (uniqueNumbers.size() < k) {
                uniqueNumbers.add(num);
            }
            if (uniqueNumbers.size() == k) {
                break;
            }
        }
        int[] answer = new int[k];
        int i = 0;
        for(int num : uniqueNumbers){
            answer[i++] = num;
        }
        while(i<k){
            answer[i++] = -1;
        }

        return answer;
    }
}
