class Solution {
    public int[] solution(int[] numbers, String dt) {
        int[] answer = new int[numbers.length];
        int temp = 0;
        
        
        if(dt.equals("right")){
            for(int i = 0; i<numbers.length; i++){
                if(i==numbers.length-1){
                    answer[0] = numbers[numbers.length-1];
                    break;
                }
                answer[i+1] = numbers[i];
                System.out.println(answer[i]);
            }
        }
        if(dt.equals("left")){
            for(int i = numbers.length-1; i>=0; i--){
                if(i==0){
                    answer[numbers.length-1]  = numbers[0];
                    break;
                }
                answer[i-1] = numbers[i]; 
            }
        }
        return answer;
    }
}