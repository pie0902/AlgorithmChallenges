class Solution {
    // 공백을 기준으로 ,로 바꿈
    static String[][] replaceStr(String[] str) {
        String[] a = new String[str.length];
        String[][] aa = new String[str.length][];

        int idx = 0;
        for (String i : str) {
            a[idx] = i.replace(" ", ",");
            idx++;
        }

        for (int i = 0; i < str.length; i++) {
            aa[i] = a[i].split(",");
        }
        return aa;
    }
// 계산 로직
    static String[] calc(String[][] str) {
        String[] result = new String[str.length];
        for (int i = 0; i < str.length; i++) {
            int num = 0;
            String t = "";
            for(int j = 0; j<3;j++){
                if(!str[i][j].equals("+")&&!str[i][j].equals("-")&&!str[i][j].equals("=")){
                    num = num + Integer.parseInt(str[i][j]);
                }
                else if(str[i][j].equals("+")){
                    num = num + Integer.parseInt(str[i][j+1]);
                    if(num!=Integer.parseInt(str[i][4])){
                        t = "X";
                        System.out.println("x");
                    }
                    else{
                        System.out.println("o");
                        t = "O";
                    }
                }
                else if(str[i][j].equals("-")){
                    num = num - Integer.parseInt(str[i][j+1]);
                    if(num!=Integer.parseInt(str[i][4])){
                        System.out.println("x");
                        t = "X";
                    }
                    else{
                        System.out.println("o");
                        t = "O";
                    }
                }
            }
            result[i] = t;
        }
        return result;
    }
    
        //["3","-","4","=","-3"]
    
    public String[] solution(String[] quiz) {
        String[][] ary = replaceStr(quiz);
        String[] answer = calc(ary);
        return answer;
    }

}