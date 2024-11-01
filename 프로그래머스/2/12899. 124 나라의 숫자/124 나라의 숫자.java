class Solution {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        String[] nums = {"4","1","2"};
        while(n>0){
            int re = n % 3;
            // re = 1 % 3;
            n = (n-1)/3;
            //1 = 0 / 3;
            answer.insert(0,nums[re]);
        }
        
        return answer.toString();
    }
}