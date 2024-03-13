class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        int copy = num;
        int idx = 0;
        while(copy!=0){
            copy = copy/10;
            idx++;   
        }
        int[] ary = new int[idx];
        for(int i = 0; i<idx; i++){
            ary[idx - 1 - i] = num%10;
            num = num/10;
        }
        for(int i = 0; i<idx; i++){
            if(ary[i]==k){
                answer = i;
                return answer+1;
            }
        }
        return -1;
    }
}