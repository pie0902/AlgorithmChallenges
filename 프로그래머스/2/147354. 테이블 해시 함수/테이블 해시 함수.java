import java.util.*;
class Solution {
    static List<Integer> list = new ArrayList<>();
    public static int cal(int k, int[] ary){
        int sum = 0;
        for(int i = 0; i<ary.length; i++){
            sum += ary[i] % k;      
        }
        return sum;
    }
    
    
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        //튜플을 정렬하고
        int answer = 0;
        Arrays.sort(data,new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                if(a[col-1] != b[col-1]){   
                    return Integer.compare(a[col-1],b[col-1]);
                }
                return Integer.compare(b[0],a[0]);
            }
        });
        
        
        // 주어진 row 범위에서 S_i 계산 및 XOR 연산
        for (int i = row_begin - 1; i <= row_end - 1; i++) {
            int s_i = cal(i + 1, data[i]);  // i+1을 k로 전달
            answer ^= s_i;  // XOR 누적
        }

        
        return answer;
    }
}