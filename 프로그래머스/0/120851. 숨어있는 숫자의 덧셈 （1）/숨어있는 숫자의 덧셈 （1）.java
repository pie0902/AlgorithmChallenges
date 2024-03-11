class Solution {
    public int solution(String my_string) {
        int answer = 0;
        char[] numList = {'1','2','3','4','5','6','7','8','9'};
        for(char i : my_string.toCharArray()){
            for(char j : numList){
                if(i==j){
                    answer = answer + (int)i - 48;
                }
            }
        }
        System.out.println((int)numList[0]-48);
        return answer;
    }
}