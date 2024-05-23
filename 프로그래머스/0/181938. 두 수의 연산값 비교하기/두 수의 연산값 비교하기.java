class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int aa = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int bb = 2*a*b;
        if(aa>bb){
            answer = aa;
        }
        else{
            answer = bb;
        }
        System.out.println(aa);
        return answer;
    }
}