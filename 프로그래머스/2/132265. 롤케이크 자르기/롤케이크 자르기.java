import java.util.*;
class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        Map<Integer,Integer> right = new HashMap<>();
        Set<Integer> left = new HashSet<>();
        //오른쪽 hashMap에 모든 값을 담는다.
        //1,2,1,3,1,4,1,2
        for(int i : topping){
            right.put(i,right.getOrDefault(i,0)+1);
        }
        for(int i = 0; i<topping.length-1; i++){
            right.put(topping[i],right.get(topping[i])-1);
            if(right.get(topping[i])==0){
                right.remove(topping[i]);
            }
            left.add(topping[i]);
            if(left.size()==right.size()){
                answer++;
            }
        }
        
        
        return answer;
    }
}