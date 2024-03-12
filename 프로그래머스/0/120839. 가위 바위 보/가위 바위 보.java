class Solution {
    public String solution(String rsp) {
        //가위 = 2
        //바위 = 0
        //보 = 5
        String answer = "";
        for(char i : rsp.toCharArray()){
            switch(i){
                case '2' : 
                    answer = answer + '0';
                    break;
                case '0' :
                    answer = answer + '5';
                    break;
                case '5' :
                    answer = answer + '2';
                    break;
            }
        }
        return answer;
    }
}