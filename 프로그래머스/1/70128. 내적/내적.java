class Solution {
    public int solution(int[] a, int[] b) {
        int answer;
        int sum = 0;
        int num = 0;
        for(int i = 0; i<a.length;i++){
            num = a[i]*b[i];
            sum = sum + num;
        }
        answer = sum;
        return answer;
    }
}