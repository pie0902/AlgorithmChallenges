class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        int idx = 0;
        char[] copyArray = cipher.toCharArray();
        for(int i = 0; i <copyArray.length; i++){
            if((i+1)%code==0){
                System.out.println(i);
                answer = answer + copyArray[i];
            }
        }
        return answer;
    }
}