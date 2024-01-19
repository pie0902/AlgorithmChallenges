class Solution {
    public int[] solution(long n) {
        String str = Long.toString(n);
        int len = str.length();
        int cnt =0;
        int[] answer = new int[len];
        for(int i = len-1; i>=0;i--){
            answer[cnt] = (int)str.charAt(i)-48;
            cnt++;
        }
        System.out.println(str);
        return answer;
    }
}