import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int i = 0;
        int cnt = 0;
        List<Integer> list = new ArrayList<>();
        while(i<arr.length){
            if(arr[i]==2){
                list.add(i);
                cnt++;
            }
            i++;
        }
        int[] t = new int[2];
        
        List<Integer> list2 = new ArrayList<>();
        if(cnt == 0){
            return new int[]{-1};
        }
        // 리스트가 비어있는 경우 처리
        if (list.isEmpty()) {
            return new int[0]; 
            // 빈 배열 반환
        }
        
        t[0] = list.get(0); // 첫 번째 요소
        t[1] = list.get(list.size() - 1); // 마지막 요소
        for(int j = t[0]; j<=t[1]; j++){
            list2.add(arr[j]);
        }
        int[] answer = new int[list2.size()];
        for(int j = 0; j<list2.size();j++){
            answer[j] = list2.get(j);
        }
        
        return answer;
    }
}