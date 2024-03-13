class Solution {
    public int solution(int n) {
        int answer = 0;
        //피자는 6
        //n이 4일때 똑같이 먹을 양
        //12
        //피자의 배수이면서 인원수로 나눴을때 나머지가 0인 숫자
        int pizza = 6;
        while(true){
            if(pizza%n == 0){
                answer = pizza/6;
                break;
            } 
            pizza = pizza + 6;
        }
        return answer;
    }
}