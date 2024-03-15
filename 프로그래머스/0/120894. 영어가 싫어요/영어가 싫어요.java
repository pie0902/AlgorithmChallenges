class Solution {
    public Long solution(String numbers) {
        long answer = 0;
        String[] nums = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numbers.length(); i++) {
            for (int j = 0; j < nums.length; j++) {
                if (numbers.startsWith(nums[j], i)) {
                    sb.append(j);
                    i += nums[j].length() - 1;
                    break;
                }
            }
        }    
      answer = Long.parseLong(sb.toString());
        return answer;
    }
}