class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = 0;
        int idx = 0;
        for(int i : array){
            if(max<i){
                max = i;
            }
        }
        for(int i = 0; i<array.length;i++){
            if(array[i]==max){
                System.out.println(i);
                idx = i;
                break;
            }
        }
        answer[0] = max;
        answer[1] = idx;
        
        return answer;
    }
}