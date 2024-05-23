class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int aa = Integer.parseInt(String.valueOf(a)+String.valueOf(b));
        int bb = Integer.parseInt(String.valueOf(b)+String.valueOf(a));
        if(aa>bb){
            answer = aa;
        }
        else{
            answer = bb;
        }
        
        
        return answer;
    }
}