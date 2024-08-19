import java.util.ArrayList;
import java.util.List;
class Solution {
    public String[] solution(String myStr) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder(myStr);
        for(int i = 0; i<myStr.length(); i++){
            if(myStr.charAt(i)=='a'||myStr.charAt(i)=='b'||myStr.charAt(i)=='c'){
                sb.setCharAt(i,' ');
            }
        }
        String[] temp = sb.toString().split(" ");
        for(String s : temp){
            if(!s.equals("")){
                list.add(s);      
            }
        }
        if(list.isEmpty()){
            return new String[] {"EMPTY"};
        }
        String[] answer = new String[list.size()];
        int idx = 0;
        for(String s : list){
            
            answer[idx] = s;
            idx++;
        }
        return answer;
    }
}