import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] query) {
        List<Integer> list = new ArrayList<>();
        for(int i : arr){
            list.add(i);
        }
        
        for(int i = 0; i<query.length;i++){
            int idx = query[i];
            if(i%2==0){
                for(int j = list.size()-1; j>idx; j--){
                     list.remove(j);
                }
            }
            else{
                for(int k = idx-1; k>=0; k--){
                     list.remove(k);
                }
            }
        }
        
        int[] answer = new int[list.size()];
         for(int i = 0; i<list.size(); i++){
             answer[i] = list.get(i);
         }
        
        return answer;
    }
}