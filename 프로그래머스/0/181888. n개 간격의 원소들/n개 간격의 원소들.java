class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] ary = new int[20];
        int cnt = 0;
        for(int i = 0; i<num_list.length;i++){
            if(i%n==0){
                ary[cnt] = num_list[i];
                cnt++;
            }
        }
        int[] answer = new int[cnt];
        for(int i = 0; i<cnt; i++){
            answer[i] = ary[i];
        }
        return answer;
    }
}