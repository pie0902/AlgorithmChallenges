import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        for(Integer num:nums){
            set.add(num);
        }  
        
        int cnt = nums.length/2;
        answer = Math.min(set.size(),cnt);
        return answer;
    }
}