class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int[] temp = new int[2];
        int min = 0;
        int max = 0;
        
        for(int i : lottos){
            if(i==0){
                max++;
            }
            else{
            for(int j : win_nums){
                    if(i == j){
                        max++;
                        min++;
                    }
                }                
            }
            
        }
        
        temp[0] = min;
        temp[1] = max;
        for(int i =0; i<2; i++){
            switch(temp[i]){
                case 0: temp[i]=6;
                break;
                case 1: temp[i]=6;
                break;
                case 2: temp[i]=5;
                break;
                case 3: temp[i]=4;
                break;
                case 4: temp[i]=3;
                break;
                case 5: temp[i]=2;
                break;
                case 6: temp[i]=1;
                break;
            }
        }
        answer[0] = temp[1];
        answer[1] = temp[0];
        
        
        
        
        
        return answer;
    }
}