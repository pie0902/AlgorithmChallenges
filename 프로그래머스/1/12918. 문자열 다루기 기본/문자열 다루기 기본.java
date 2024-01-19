class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        int a;
        if(s.length()!=4&&s.length()!=6){
            answer = false;
        }
        for(int i = 0; i<s.length();i++){
            a = s.charAt(i);
            if(a<48||a>57){
                answer = false;
            }
            System.out.println(a);
        }
        return answer;
    }
}