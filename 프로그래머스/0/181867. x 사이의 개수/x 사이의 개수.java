class Solution {
    public int[] solution(String myString) {
        
        String[] copy = myString.split("x",-1);
        int[] answer = new int[copy.length];
        
        for(int i = 0; i<copy.length;i++){
            answer[i] = copy[i].length();
        }
        
        return answer;
    }
}