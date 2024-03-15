class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int i = 0; i<array.length; i++){
            if(array[i]%7==0||array[i]>10){
                while(array[i]!=0){
                    if(array[i]%10 == 7){
                        answer++;
                    }
                    System.out.println(array[i]);
                    array[i] = array[i]/10;
                    
                }
            }
        }
        return answer;
    }
}