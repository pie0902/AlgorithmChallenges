import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> intList = new ArrayList<>();
        
        for(int i = 0; i<intStrs.length;i++){
            String temp = intStrs[i].substring(s,s+l);
            int num = Integer.parseInt(temp);
            if(num>k){
                intList.add(num);
            }
        }
        int[] answer = new int[intList.size()];
        for(int i = 0; i<intList.size();i++){
            answer[i] = intList.get(i);
        }
        
        return answer;
    }
}