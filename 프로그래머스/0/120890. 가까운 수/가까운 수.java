import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int idx = 0;
        int min = Math.abs(array[0]-n);
        for(int i = 0; i<array.length;i++){
            int r = Math.abs(array[i]-n);
            if(min>r || (r == min && array[i] < array[idx])){
                min = r;
                idx = i;
            }

        }
        System.out.println(min + "그리고" + idx);
        answer = array[idx];
        return answer;
    }
}