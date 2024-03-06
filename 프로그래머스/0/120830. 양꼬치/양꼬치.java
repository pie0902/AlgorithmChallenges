class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int main = n*12000;
        int sub = k*2000;
        int service= (n/10) * 2000;
        answer = main + sub - service;
        return answer;
    }
}