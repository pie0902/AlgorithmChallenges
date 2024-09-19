import java.util.*;

class Solution {
    
    public static boolean check(String str){
        char[] cc = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(char c : cc){
            if(c=='['||c=='{'||c=='('){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char p = stack.pop();
                if((c==')'&&p!='(')||(c=='}'&&p!='{')||(c==']'&&p!='[')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    
    
    public int solution(String s) {
        int answer = 0;
        String str = "";
        char[] c = s.toCharArray();
        int idx = 1;
        while(!str.equals(s)){
            str = "";
            for(int i = idx; i<c.length; i++){
                str+=c[i];
            }
            for(int i = 0; i<idx; i++){
                str+=c[i];
            }
            idx++;
            if(check(str)){
                answer++;
            }
        }
                
        
        return answer;
    }
}