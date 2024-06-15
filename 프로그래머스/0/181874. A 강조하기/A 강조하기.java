class Solution {
    public String solution(String myString) {
        String answer = "";
        char[] copy = myString.toCharArray();
        int len = copy.length;
        for(int i = 0 ; i< len; i++){
            if(copy[i]=='a'){
                copy[i] = Character.toUpperCase(copy[i]);
            }
            else if(copy[i]!='A'&&copy[i]!='a'){
                copy[i] = Character.toLowerCase(copy[i]);
            }
        }
        String a = new String(copy);
        answer = a;
        return answer;
    }
}