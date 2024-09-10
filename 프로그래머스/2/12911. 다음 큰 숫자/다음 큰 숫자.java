class Solution {
    public int solution(int n) {
        int cnt = Integer.bitCount(n);  // n의 2진수에서 1의 개수를 구함
        int count = n + 1;  // n보다 큰 수부터 시작
        
        while (Integer.bitCount(count) != cnt) {  // 1의 개수가 같은 수를 찾을 때까지 반복
            count++;
        }
        
        return count;  // 찾은 숫자를 반환
    }
}
