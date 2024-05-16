class Solution {
    public String[] solution(String[] names) {
        int len = names.length;
        String[] ary= new String[len];
        int cnt = 0;
        for(int i = 0; i<len; i++){
            if(i%5==0){
                ary[cnt] = names[i];   
                cnt++;
            }
        }
        String[] answer = new String[cnt];
        for(int i = 0; i<cnt; i++){
            answer[i] = ary[i];
        }
        
        
        return answer;
    }
}