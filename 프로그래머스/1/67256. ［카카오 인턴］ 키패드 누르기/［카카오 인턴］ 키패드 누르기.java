class Solution {
    public static int distance(int p1[],int p2[]){
        return Math.abs(p1[0]-p2[0])+Math.abs(p1[1]-p2[1]);
    }
    
    public String solution(int[] nums, String hand) {
        String answer = "";
        int[][] p = {
            {0,0},{0,1},{0,2},//1 2 3
            {1,0},{1,1},{1,2},//4 5 6
            {2,0},{2,1},{2,2},//7 8 9
            {3,1}//0
        };
        int[] leftHand = {3,0};
        int[] rightHand = {3,2};
        
        for(int i = 0; i<nums.length; i++){
            if(nums[i]==1||nums[i]==4||nums[i]==7){
                answer+='L';
                leftHand=p[nums[i]-1];
            }else if(nums[i]==3||nums[i]==6||nums[i]==9){
                answer+='R';
                rightHand=p[nums[i]-1];
            }else{
                int[] move;
                if(nums[i]==0){
                    move = p[9];
                }
                else{
                    move = p[nums[i]-1]; 
                }
                
                int leftMove = distance(leftHand,move);
                int rightMove = distance(rightHand,move);    
                
                if(leftMove>rightMove){
                    answer+='R';
                    rightHand =move;
                }else if(leftMove<rightMove){
                    answer+='L';
                    leftHand = move;
                }
                else{
                    if(hand.equals("left")){
                        answer+='L';
                        leftHand = move;
                    }
                    else{
                        answer+='R';
                        rightHand = move;
                    }
                }
            }    
        }
        return answer;                                     
    }
}