import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;



class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> sum = new HashSet<>();
        for(int i = 0; i<numbers.length; i++){
            for(int j = i+1; j<numbers.length;j++){
                sum.add(numbers[i]+numbers[j]);
            }           
        }
        int[] answer = new int[sum.size()];
        int index = 0;
        for(Integer s : sum){
            answer[index++] = s;
        }
        Arrays.sort(answer);
        return answer;
    }
}