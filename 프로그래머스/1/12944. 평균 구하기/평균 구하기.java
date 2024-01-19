class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int sum = 0;
        int size = arr.length;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        answer= (double)sum/(double)arr.length;
        System.out.println(answer);
        return answer;
    }
}