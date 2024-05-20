class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        int len = my_strings.length;
        //반복문의 길이를 parts[i][0]~parts[i][1]로 설정
        //그 길이만큼 문자열을 잘라서 붙인다..
        for(int i = 0; i<len;i++){
            char[] copy = my_strings[i].toCharArray();
            for(int k = parts[i][0]; k<=parts[i][1]; k++){
                answer += copy[k];
            }
            
        }
        return answer;
    }
}