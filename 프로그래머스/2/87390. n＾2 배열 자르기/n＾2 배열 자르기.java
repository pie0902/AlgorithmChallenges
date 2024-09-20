class Solution {
    public int[] solution(int n, long left, long right) {
        //2 ~ 5
        int[] answer = new int[(int)(right - left+1)];
        for(long i = left; i<=right; i++){
            int row = (int)(i/n);
            int col = (int)(i%n);
            //System.out.println(row+"그리고 "+col);
            answer[(int)(i-left)] = Math.max(row,col) + 1;
        }
        
        
        return answer;
    }
}