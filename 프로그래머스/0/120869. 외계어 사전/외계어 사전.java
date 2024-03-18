import java.util.*;
class Solution {
    public boolean check(String[] a, String[] b){
        String aString = String.join("",a);
        char[] aChar = aString.toCharArray();
        Arrays.sort(aChar);
        String resA = new String(aChar);
        
        for(String i : b){
            char[] bChar = i.toCharArray();
            Arrays.sort(bChar);
            String resB = new String(bChar);
            if(resA.equals(resB)){
                return true;
            }
        }
        return false;
        
    }
    
    
    
    public int solution(String[] spell, String[] dic) {
        int answer = check(spell,dic) ? 1: 2;
        return answer;
    }
}