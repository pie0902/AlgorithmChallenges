import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        
        HashMap<Character, Integer> scores = new HashMap<>();
        scores.put('R', 0);
        scores.put('T', 0);
        scores.put('C', 0);
        scores.put('F', 0);
        scores.put('J', 0);
        scores.put('M', 0);
        scores.put('A', 0);
        scores.put('N', 0);
        
        for(int i = 0; i<survey.length;i++){
            char disagree = survey[i].charAt(0);
            char agree = survey[i].charAt(1);
            int choice = choices[i];
            if(choice<4){
                scores.put(disagree,scores.get(disagree)+(4-choice));
            }
            else if(choice>4){
                scores.put(agree,scores.get(agree)+(choice-4));
            }
        }
        StringBuilder result = new StringBuilder();
        result.append(scores.get('R') >= scores.get('T') ? 'R': 'T');
        result.append(scores.get('C') >= scores.get('F') ? 'C': 'F');
        result.append(scores.get('J') >= scores.get('M') ? 'J': 'M');
        result.append(scores.get('A') >= scores.get('N') ? 'A': 'N');

        answer = result.toString();
        
        
        
        
        
        return answer;
    }
}