class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int len = 0;
        for(int i = num1; i<=num2;i++){
            len++;
        }
        int[] answer = new int[len];
        int idx = 0;
        for(int i = num1; i<=num2;i++){
            answer[idx] = numbers[i];
            idx++;
            
        }
        return answer;
    }
}