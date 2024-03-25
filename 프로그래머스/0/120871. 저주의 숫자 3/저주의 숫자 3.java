class Solution {
    public static boolean containsThree(int number) {
        String str = String.valueOf(number);
        return str.contains("3");
    }
    public int solution(int n) {
        int answer = 0;
        int i=0;
        while(i<n){
            answer++;
            if(answer%3!=0&&!containsThree(answer)){
                i++;
            }

        }
        return answer;
    }
}