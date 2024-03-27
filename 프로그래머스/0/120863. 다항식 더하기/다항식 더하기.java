class Solution {
    public static String[] test(String polynomial) {
        //문자열을 char 배열로 변환
        char[] copy = polynomial.toCharArray();
        //","를 기준으로 만들 문자열
        String str = "";
        //' ' 거나 ' + ' 이면 건너 뜀 && 문자열에 내용이 있고 마지막이 ,이 아닐때 ,를 추가
        for (char i : copy) {
            if (i != ' ' && i != '+') {
                str = str + i;
            } else {
                if (str.length() > 0 && str.charAt(str.length() - 1) != ',') {
                    str = str + ',';
                }
            }
        }
        //","을 기준으로 문자열 배열 생성
        String[] result = str.toString().split(",");
        //ex1 [3x,7,x]
        //ex2 [5,5,5]
        //ex3 [x,x,x]
        return result;
    }
    public String solution(String polynomial) {
        String[] result = test(polynomial);
        int a = 0;
        int b = 0;
        //지금 생각해야할것 [3x,7,x] 어떻게 나눌것인지 x를 기준으로 더하기를 한다.
        for(String i : result) {
            if (i.contains("x")) {
                if (i.equals("x")) {
                    a = a + 1;
                } else {
                    i = i.replace("x","");
                    a = a + Integer.parseInt(i);
                }
            }
            else {
                b = b + Integer.parseInt(i);
            }
        }
        System.out.println(a + "그리고" + b);
        String answer = "";
        String aNum = "";
        if(a == 1){
            aNum = "x";
        }
        else {
            aNum = String.valueOf(a) + "x";
        }
        String bNum = String.valueOf(b);
        if(a!=0&&b!=0) {
            answer = aNum + " + " + bNum;
        }
        else if(a!=0&&b==0){
            answer = aNum;
        }
        else{
            answer = bNum;
        }
        return answer;
    }
}