import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] num_list) {
        List<Integer> ary = new ArrayList<>();
        
        int cnt = 0;
        Arrays.sort(num_list);
        for(int i = 5; i<num_list.length;i++){
            ary.add(num_list[i]);
        }
        int[] answer = new int[ary.size()];
        for(int i = 0; i<ary.size(); i++){
            answer[i] = ary.get(i);
        }
        return answer;
    }
}