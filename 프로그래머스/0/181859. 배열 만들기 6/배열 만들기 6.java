import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while(i<arr.length){
            if(list.isEmpty()){
                list.add(arr[i]);
            }
            else{
                if(list.get(list.size()-1)==arr[i]){
                    list.remove(list.size()-1);
                }
                else if(list.get(list.size()-1)!=arr[i]){
                    list.add(arr[i]);
                }
            }
            i++;

        }
        int[] answer = new int[list.size()];
        if(list.isEmpty()){
            return new int[]{-1};
        }
        else{  
            int idx = 0;
            for(int a : list){
                answer[idx] = a;
                idx++;
            }
        }
        return answer;
    }
}