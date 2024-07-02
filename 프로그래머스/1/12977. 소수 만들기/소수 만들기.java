class Solution {
    public static boolean check(int a){
        if(a<2){
            return false;
        }
        for(int i = 2; i<=Math.sqrt(a);i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
    
    
    
    public int solution(int[] nums) {
        int answer = 0;
        for(int i = 0; i<nums.length; i++){
            for( int j = i+1; j<nums.length;j++){
                for(int k = j+1;k<nums.length;k++){
                    int sum = nums[i]+nums[j]+nums[k];
                    if(check(sum)){
                        answer++;
                    }
                }
                
            }
        }
        return answer;
    }
}