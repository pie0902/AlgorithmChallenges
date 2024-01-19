class Solution {
    public int solution(int n) {
        int answer = 0;
        String temp = "";
        int b;
        while(n!=0){
            int a = n%3;
            n = n/3;
            char c = (char)('0'+ a);
            temp = temp + c;
        }
        int i = 0;
        for (int j = temp.length() - 1; j >= 0; j--) { 
            answer += (int)Math.pow(3, i) * (temp.charAt(j) - '0');
            i++;
        }
        return answer;

    }
}