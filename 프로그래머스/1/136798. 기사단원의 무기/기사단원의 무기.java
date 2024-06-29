class Solution {    
    public int solution(int number, int limit, int power) {
        int sum = 0;
        
        for (int i = 1; i <= number; i++) {
            int countDivisors = countDivisors(i);
            
            if (countDivisors <= limit) {
                sum += countDivisors;
            } else {
                sum += power;
            }
        }
        
        return sum;
    }
    
    // 숫자 num의 약수 개수를 구하는 메서드
    private int countDivisors(int num) {
        int count = 0;
        
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        
        // 자기 자신도 약수이므로 +1
        return count + 1;
    }
}