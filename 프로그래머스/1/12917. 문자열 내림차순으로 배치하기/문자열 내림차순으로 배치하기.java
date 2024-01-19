class Solution {
    public String solution(String s) {
        String answer = "";
        int temp = 0;
        int a[] = new int[s.length()];
        for(int i = 0; i<s.length();i++){
            a[i] = s.charAt(i);
        }
        for(int i = 0; i<a.length;i++){
            for(int j= 0; j<a.length;j++){
                if(a[i]>a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(int i = 0; i<s.length();i++){
            answer = answer + (char)(a[i]);
        }
        return answer;
    }
}