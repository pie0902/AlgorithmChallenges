import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] st = new int[n];
        Arrays.fill(st,1);
        for(int i : lost){
            st[i-1]--;
        }
        for(int i : reserve){
            st[i-1]++;
        }
        for(int i : st){
            System.out.print( i + " ");
        }
        //첫번째 걸러내기
        for(int i = 1; i<n;i++){
            if(st[i-1]==0&&st[i]>1){
                st[i-1] = 1;
                st[i] -= 1;
            }
            else if(st[i-1]>1&&st[i]==0){
                st[i-1]-=1;
                st[i] = 1;
            }
        }
        
        
        
        System.out.println();
        
        for(int i : st){
            if(i!=0){
                answer++;
            }
        } 
        return answer;
    }
}