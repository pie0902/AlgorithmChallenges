class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int a = 0;
        int idx = 0;
        if((common[1]-common[0])==(common[2]-common[1])){
            answer = common[common.length-1]+(common[1]-common[0]);
        }
        else{
            double b = common[1]/common[0];
            answer = common[common.length-1]*(int)b;
        }
        return answer;
    }
}