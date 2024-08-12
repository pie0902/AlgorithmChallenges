import java.util.*;
class Solution {
    public int[] solution(int n) {
        int idx = 1;
        int nn = n;
        while(n!=1){
            if(n%2==0){
                n = n/2;
            }
            else{
                n = 3 * n + 1;
            }
            idx++;
            System.out.println(n);
        }
        int[] answer = new int[idx];
        int cnt = 1;
        answer[0] = nn;
        while(nn!=1){
            if(nn%2==0){
                nn = nn/2;
            }
            else{
                nn = 3 * nn + 1;
            }
            answer[cnt] = nn;
            cnt++;
        }
        System.out.println(idx);       
        return answer;
    }
}