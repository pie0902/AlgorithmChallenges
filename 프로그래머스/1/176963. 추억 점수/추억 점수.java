import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        
        Map<String,Integer> nameScore = new HashMap<>();
        for(int i = 0; i<name.length;i++){
            nameScore.put(name[i],yearning[i]);    
        }
        int[] answer = new int[photo.length];
        for(int i = 0; i<photo.length;i++){
            int score = 0;
            for(String person: photo[i]){
                if(nameScore.containsKey(person)){
                    score = score + nameScore.get(person);
                }
            }
            answer[i] = score;
        }
        
        return answer;
    }
}