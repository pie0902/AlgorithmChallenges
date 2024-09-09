
class Solution {
    public static String binary(String s){
        String after = "";
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)=='1'){
                after += s.charAt(i);
            }
        }
        int len = after.length();
        String re = "";
        while(len>0){
            re = (len%2) + re;
            len = len/2;
        }
        return re;
        
    }
    public static int zeroCnt(String s){
        int cnt = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)=='0'){
                cnt++;
            }
        }
        return cnt;
    }
    
    
    
    public int[] solution(String s) {
        int[] answer = new int[2];
        int cnt = 0;
        int zCnt = 0;
        while(!s.equals("1")){
            cnt ++;
            zCnt += zeroCnt(s);
            s = binary(s);
        }
        answer[0] = cnt;
        answer[1] = zCnt;
        return answer;
    }
}