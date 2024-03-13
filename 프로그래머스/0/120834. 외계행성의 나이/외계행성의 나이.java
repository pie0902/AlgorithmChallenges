class Solution {
    public String solution(int age) {
        String answer = "";
        int copy = age;
        
        int idx = 0;
        // 인덱스 구하기
        while(copy != 0){
            copy = copy / 10;
            idx++;
        }
        
        char[] copya = new char[idx];
        int temp = 0;
        // 아스키 코드 변환
        for(int i = 0; i < idx; i++){
            temp = (age % 10) + 97;
            copya[idx - 1 - i] = (char)temp;
            age = age / 10;
        }
        
        answer = new String(copya);
        return answer;
    }
}