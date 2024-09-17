import java.util.*;
class Solution {
    public int solution(int k, int[] t) {
        int answer = 0;
        int cnt = 1;
        List<Integer> list = new ArrayList<>();
        Arrays.sort(t);
        //1,2,2,3,3,4,5,5
        //1 1 2 1 2 1 1 2
        for(int i = 1; i<t.length;i++){
            if(t[i-1]==t[i]){
                cnt++;
            }
            else{
                list.add(cnt);
                cnt = 1;
            }
        }
        list.add(cnt);
        Collections.sort(list, Comparator.reverseOrder());
        for(int i : list){
            System.out.print(i + " ");
            k = k - i;
            answer++;
            if(k<=0){
                break;   
            }
        }
        return answer;
    }
}