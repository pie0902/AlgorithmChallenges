class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String b = s.toLowerCase();
        char[] copy = b.toCharArray();
        int cntP = 0;
        int cntY = 0;
        
        for(int i = 0; i<copy.length;i++){
            if(copy[i]=='p'){
                cntP++;
            }
            else if(copy[i]=='y'){
                cntY++;   
            }
        }
        if(cntP==cntY){
            answer = true;
        }
        else{
            answer = false;
        }

        return answer;
    }
}