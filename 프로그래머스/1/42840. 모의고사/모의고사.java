class Solution {
    
    public static int check(int[] nums,int[] answers){
        int idx = 0;
        int score = 0;
        for(int i = 0; i<answers.length;i++){
            if(answers[i] == nums[idx]){
                score++;
            }
            idx++;
            if(idx==nums.length){
                idx = 0;
            }
        }
        return score;
    }
    
    public int[] solution(int[] answers) {
        
        int[] a = {1,2,3,4,5};
        int[] b = {2,1,2,3,2,4,2,5};
        int[] c = {3,3,1,1,2,2,4,4,5,5};
        int s1 = check(a,answers);
        int s2 = check(b,answers);
        int s3 = check(c,answers);
        System.out.println(s1+" "+s2+" "+s3);
        int[] answer;
        int maxScore = Math.max(s1, Math.max(s2, s3));
        if (s1 == s2 && s2 == s3) {
            answer = new int[] {1, 2, 3};
        }
        // 두 사람의 점수가 같은 경우
        else if (s1 == s2  && s1 ==maxScore) {
            answer = new int[] {1, 2};
        }
        else if (s1 == s3 && s1 == maxScore){
            answer = new int[] {1,3};
        }
        else if (s2 == s3 && s2== maxScore) {
            answer = new int[] {2, 3};
        }
        else{
            if(maxScore==s1){
                answer = new int[] {1};    
            }
            else if(maxScore==s2){
                answer = new int[] {2};    
            }
            else{
                answer = new int[] {3};    
            }
        }
        
        return answer;
    }
}