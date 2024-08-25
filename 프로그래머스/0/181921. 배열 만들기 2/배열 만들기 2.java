import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        
        List<Integer> list = new ArrayList<>();
        String[] strs = {"1","2","3","4","6","7","8","9"};
        for(int i = l; i<=r; i++){
            int cnt = 0;
            String str = String.valueOf(i);
            for(int j = 0; j<strs.length; j++){
                if(str.contains(strs[j])){
                    cnt++;
                }
            }
            if(cnt==0){
                int num = Integer.parseInt(str);
                list.add(num);
            }
        }
        if(list.isEmpty()){
            return new int[]{-1};
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        
        
        
        return answer;
    }
}