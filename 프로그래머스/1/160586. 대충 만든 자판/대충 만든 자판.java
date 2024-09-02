import java.util.*;
class Solution {
    
    public static int cur(char c,String[] ary){
        int idx = 0;
        boolean found = false;
        for(int i = 0; i<ary.length; i++){
            for(int j = 0; j<ary[i].length();j++){
                if(c==ary[i].charAt(j)){
                    found = true;
                    if(idx == 0){
                        idx = j+1;
                    }
                    if(idx!=0&&idx>j){
                        idx = j+1;   
                    }                    
                }
            }
        }
        if(found == true){
            return idx;    
        }
        return -1;
    }
    
    
    public int[] solution(String[] keymap, String[] targets) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<targets.length; i++){
            int sum = 0;
            for(int j = 0; j<targets[i].length(); j++){
                if(cur(targets[i].charAt(j),keymap)== -1){
                    sum = -1;
                    break;
                }
                sum += cur(targets[i].charAt(j),keymap);            
                
            }
            if(sum!=0){
                list.add(sum);    
            }
            }
        int[] answer = new int[list.size()];
        int idx = 0;
        if(list.isEmpty()){
            return new int[]{-1};
        }
        for(int i : list){
            answer[idx] = i;
            idx++;
        }
        
        return answer;
    }
}