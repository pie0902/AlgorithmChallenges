class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String a = "";
        for (int i = 0; i < my_string.length(); i++) {
         if(Character.isDigit(my_string.charAt(i))){
                a = a + my_string.charAt(i);
            }
            else{
                if(a.length()>0){
                    answer += Integer.parseInt(a);
                    a="";
                }
            }
        }
        if(!a.isEmpty()){
            answer +=Integer.parseInt(a);
        }
        System.out.println(answer);
        return answer;
    }
}