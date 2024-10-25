import java.util.*;
class Solution {
    static int answer = 0;
    public static boolean check(int val){
        if(val<2) return false;
        for(int i = 2; i*i <=val; i++){
            if(val % i == 0){
                return false;
            }
        }
        return true;
    }
    
    
    public static void dfs(char[] ary,boolean[] v,String str,Set<Integer> set){
        if(!str.equals("")){
            int val = Integer.parseInt(str);
            if(!set.contains(val)){
                set.add(val);
                if(check(val)){
                    answer++;
                }
            }
        }
        for(int i = 0; i<ary.length; i++){
            if(!v[i]){
                v[i] = true;
                dfs(ary,v,str+ary[i],set);
                v[i] = false;
            }   
        }
    }
    
    public int solution(String numbers) {
        char[] c = numbers.toCharArray();
        boolean[] v = new boolean[c.length];
        Set<Integer> set = new HashSet<>();
        dfs(c,v,"",set);
        return answer;
    }
}