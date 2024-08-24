class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length*k];
        int idx = 0;
        for(int i = 0; i<picture.length; i++){
            char[] copy = new char[picture[i].length()*k];
            int cnt = 0;
            int cut = 0;
            String temp = "";
            for(int j = 0; j<copy.length; j++){
                copy[j] = picture[i].charAt(cnt);
                temp += copy[j];
                cut++;
                if(cut==k){
                    cut = 0;
                    cnt++;
                }
            }
            for(int b = 0; b<k; b++){
                answer[idx] = temp;
                idx++;
            }
            
            
            System.out.println(answer[i]);
        }
        return answer;
    }
}