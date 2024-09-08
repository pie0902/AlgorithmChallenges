class Solution {
    public String solution(String s) {
        String[] ary = s.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<ary.length; i++){
            int num = Integer.parseInt(ary[i]);
            if(num<min){
                min = num;
            }
            if(num>max){
                max = num;
            }
        }
        
        String answer = min + " " + max;
        return answer;
    }
}