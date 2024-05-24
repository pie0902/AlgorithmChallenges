import java.util.ArrayList;
import java.util.List;
class Solution {
    public String[] solution(String my_string) {
        String[] copy = my_string.split(" ");
        List<String> aa = new ArrayList<>();
        for(int i = 0; i<copy.length; i++){
            if(!copy[i].equals("")){
                aa.add(copy[i]);
            }
        }
        String[] answer = new String[aa.size()];
        for(int i =0; i<aa.size();i++){
            System.out.println(aa.get(i));
            answer[i] = aa.get(i);
        }
        return answer;
    }
}