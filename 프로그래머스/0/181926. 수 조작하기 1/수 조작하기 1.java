class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        char[] copy = control.toCharArray();
        for(int i = 0; i<control.length();i++){
            if(copy[i]=='w'){
                n += 1;
            }
            else if(copy[i]=='s'){
                n -= 1;
            }
            else if(copy[i]=='d'){
                n += 10;
            }
            else if(copy[i]=='a'){
                n -= 10;
            }
        }
        answer = n;
        return answer;
    }
}