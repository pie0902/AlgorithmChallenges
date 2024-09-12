import java.util.*;
class Solution {
    public long solution(int n) {
        long a = 0;
        long b = 1;
        for(int i = 0; i<n; i++){
            long temp = b;
            b = (a+b)%1234567;
            a = temp;
        }
        return b;
    }
}