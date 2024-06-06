class Solution {
    public String solution(String myString) {
   
        char[] copy = myString.toCharArray();
        for(int i = 0; i<myString.length();i++){
               if(copy[i]<'l'){
                    copy[i]='l';
               }
        }
             String answer = new String(copy);
        return answer;
    }
}