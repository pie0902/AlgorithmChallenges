class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String a = "";
        char[] copy = myString.toCharArray();
        for(int i = 0; i<myString.length();i++){
            if(copy[i]=='A'){
                a += 'B';
            }
            else{
                a += 'A';
            }
        }
        if(a.contains(pat)){
            answer = 1;
        }
        else{
            answer = 0;
        }
        return answer;
    }
}