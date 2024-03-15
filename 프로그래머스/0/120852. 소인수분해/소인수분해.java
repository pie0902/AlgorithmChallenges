import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

class Solution {
    public int[] solution(int n) {
        List<Integer> a = new ArrayList<>();
        int i = 2;
            while(n!=1){
                if(n%i==0){
                    a.add(i);
                    n = n/i;
                }
                else{
                    i++;    
                }
            }
        for(int z : a){
            System.out.println(z);
        }
        Set<Integer> set = new HashSet<>(a);
        int[] answer = set.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);
        return answer;
    }
}