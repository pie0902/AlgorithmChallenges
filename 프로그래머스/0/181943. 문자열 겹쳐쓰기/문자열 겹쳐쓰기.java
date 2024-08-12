class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        // 1. 앞부분 추출 (s 이전까지)
        String front = my_string.substring(0, s);
        
        // 2. 뒷부분 추출 (s + overwrite_string.length() 이후부터 끝까지)
        String back = my_string.substring(s + overwrite_string.length());
        
        // 3. 결과 문자열 합치기
        return front + overwrite_string + back;
    }
}