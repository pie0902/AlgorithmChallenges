import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Arrays.sort(nums);
        List<Integer> lists = new ArrayList<>();
        lists.add(nums[0]);
        for(int i = 1; i<nums.length; i++){
            if(nums[i-1]!=nums[i]){
                lists.add(nums[i]);   
            }
        }
        for(int i :lists){
            System.out.println(i);
        }
        answer = lists.size();
        if(answer>(nums.length/2)){
            answer = nums.length/2;
        }
        return answer;
    }
}