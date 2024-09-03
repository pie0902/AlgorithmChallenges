import java.util.*;
class Solution {
    
    public static boolean check(String[] temp,String[] todayTemp, int td){
        //유효기한
        int pYear = Integer.parseInt(temp[0]);
        int pMonth = Integer.parseInt(temp[1]);
        int pDay = Integer.parseInt(temp[2]);
        //현재날짜
        int test = 0;
    
        
        for(int i = 0; i<td; i++){
            for(int j = 0; j<28; j++){
                if(pDay>28){
                    pMonth+=1;
                    pDay = 1;
                    if(pMonth>12){
                        pYear += 1;
                        pMonth = 1;
                        pDay = 1;
                    }
                }
                pDay+=1;
            }
        }
        
        pDay -= 1;
        if(pDay==0){
            pMonth -= 1;
            pDay = 28;
        }
        if(pMonth==0){
            pYear -= 1;
            pMonth = 12;
        }
        
        String strm = String.valueOf(pMonth);
        if(strm.length()==1){
            strm = "0" + strm;
        }
        String strd = String.valueOf(pDay);
        if(strd.length()==1){
            strd = "0" + strd;
        }
        //비교
        String aaa = String.valueOf(pYear) + strm + strd;
        String bbb = todayTemp[0] + todayTemp[1] + todayTemp[2];
        if(aaa.compareTo(bbb) >= 0){
            return true;
        }
        
        
        
        
        //System.out.println(pYear + " " + pMonth + " " + pDay);
        return false;
        
        
        
        
    }
    
    
    public int[] solution(String today, String[] terms, String[] p) {
        List<Integer> list = new ArrayList<>();
        //privacies를 날짜와 타입으로 쪼갬
        char[] type = new char[p.length];
        String[] date = new String[p.length];
        for(int i = 0; i<p.length; i++){
            type[i] = p[i].charAt(p[i].length()-1);
            date[i] = p[i].substring(0,10);
        }
        String[] todayTemp = today.replace('.',' ').split(" ");
        
        
        //날짜를 계산해서 폐기인지 아닌지 맞춤
        for(int i = 0; i<p.length; i++){
            //p[i]를 문자배열로 변경
            String[] dateTemp = date[i].replace('.',' ').split(" ");
            for(int j = 0; j<terms.length; j++){
                //terms[j] 를 문자배열로 변경
                String[] termsCopy = terms[j].split(" ");
                //문자배열의 0번째 인덱스인 타입과, 비교하고자 하는 날짜의 타입이 일치하는지 확인
                if(termsCopy[0].equals(String.valueOf(type[i]))){
                    //일치한다면 문자열로 만든 terms의 숫자를 정수형으로 체크함수에 보냄
                    int plusNum = Integer.parseInt(termsCopy[1]);
                    //비교하고자 하는 날짜와, 오늘 날짜, 그리고 더할 숫자를 보냄
                    boolean cc = check(dateTemp,todayTemp,plusNum);
                    if(!cc){
                        list.add(i+1);
                    }
                }
            }
        }
        int[] answer = new int[list.size()];
        int idx = 0;
        for(int i : list){
            answer[idx] = i;
            idx++;
        }
        Arrays.sort(answer);
        return answer;
    }
}