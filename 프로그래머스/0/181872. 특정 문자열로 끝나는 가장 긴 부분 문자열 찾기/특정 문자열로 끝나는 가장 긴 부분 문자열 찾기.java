class Solution {
    public String solution(String myString, String pat) {
        String p = "";
        char[] c = pat.toCharArray();
        for(int i = pat.length()-1; i>=0; i--){
            p += c[i];
        }
        
        char[] cc = p.toCharArray();
        int idx = 0;
        int cnt = 0;
        int temp = 0;
        for(int i = myString.length()-1; i>=0; i--){
            if(myString.charAt(i)== cc[idx]){
                cnt++;
                idx++;
            }
            System.out.println(cnt);
            if(cnt==cc.length){
                temp = i+cnt;
                break;
            }
        }
        String answer = myString.substring(0,temp);
        
        return answer;
    }
}