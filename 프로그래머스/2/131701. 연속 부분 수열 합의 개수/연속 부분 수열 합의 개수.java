import java.util.*;

class Solution {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();  // 중복되지 않는 부분 수열의 합을 저장할 Set
        
        // 원형 배열처럼 처리하기 위해 배열 두 배로 복사
        int[] copy = new int[elements.length * 2];
        System.arraycopy(elements, 0, copy, 0, elements.length);
        System.arraycopy(elements, 0, copy, elements.length, elements.length);

        for(int i = 0; i<elements.length; i++){
            for(int j = 0; j<elements.length; j++){
                int sum = 0;
                for(int k = 0; k<i; k++){
                    sum += copy[j+k];
                    //     copy[1]
                    //.    copy[2]
                }
                set.add(sum);
            }
        }

        return set.size();
    }
}
