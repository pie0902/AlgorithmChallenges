import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        
        Arrays.sort(A);
        Arrays.sort(B);
        int[] B2 = new int[B.length];
        int idx = 0;
        
        for(int i = B.length-1; i>=0; i--){
            B2[idx++] = B[i];
        }
        int sum = 0;
        for(int i = 0; i<A.length; i++){
                int num = A[i]*B2[i];
                sum += num;
        }
        answer = sum;
        return answer;
    }
}