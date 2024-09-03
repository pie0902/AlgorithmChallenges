class Solution {
    public String solution(String new_id) {
        //대문자를 소문자 변환
        StringBuilder sb = new StringBuilder(new_id.toLowerCase());
        StringBuilder sb2 = new StringBuilder();
        //소문자 숫자 빼기 밑줄 마침표를 제외한 모든 문자 제거
        for(int i = 0; i < sb.length(); i++){
            char c = sb.charAt(i);
            if((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == '-' || c == '_' || c == '.'){
                sb2.append(c);
            }
        }
        //.중복제거
        for(int i = 1; i<sb2.length(); i++){
            if(sb2.charAt(i)=='.'&&sb2.charAt(i-1)=='.'){
                sb2.deleteCharAt(i-1);
                i--;
            }
        }
        //앞 뒤 제거
        if(sb2.charAt(0)=='.'){
            sb2.deleteCharAt(0);
        }
        else if(sb2.charAt(sb2.length()-1)=='.'){
            sb2.deleteCharAt(sb2.length()-1);
        }
        //빈 문자일 때 a 추가
        if(sb2.length() == 0){
           sb2.append("a");
        }
        //16글자이면 15까지만 남기고 제거
        if(sb2.length() > 15){
            sb2 = new StringBuilder(sb2.substring(0, 15)); // 앞에서 15개 문자만 남기기
        }
        if(sb2.charAt(sb2.length()-1)=='.'){
            sb2.deleteCharAt(sb2.length()-1);
        }
        //길이가 2 이하면 마지막 문자를 3 될때까지 반복
        if(sb2.length()<3){
            char temp = sb2.charAt(sb2.length()-1);
            
            for(int i = sb2.length(); i<3; i++){
                sb2.append(temp);   
            }
        }
        
        
        
        
        
        
        String answer = sb2.toString();
        return answer;
    }
}