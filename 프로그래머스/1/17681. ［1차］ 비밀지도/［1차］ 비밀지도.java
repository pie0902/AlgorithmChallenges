class Solution {
    public static String digit(int n,int len){
        String num = "";
        while(n!=0){
            int b = n%2;
            char h = (char)(b + '0');
            num += h;
            n = n/2;
        }
        //---역순 시작 ----
        char[] re = num.toCharArray();
        StringBuilder str = new StringBuilder();
        for(int i = 0; i<len-re.length;i++){
            str.append("0");
        }
        for(int i = re.length-1; i>=0; i--){
            str.append(re[i]);
        }
        return str.toString();
    }
    public static String cg(String one,String two){
        String temp = "";
        for(int i = 0; i<one.length(); i++){
            if(one.charAt(i)=='0'&&two.charAt(i)=='0'){
                temp += " ";
            }
            else{
                temp += "#";
            }
        }    
        return temp;
    }
    
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] s1 = new String[n];
        String[] s2 = new String[n];
        for(int i = 0; i<arr1.length;i++){
            s1[i] = digit(arr1[i],n);
            s2[i] = digit(arr2[i],n);
            answer[i] = cg(s1[i],s2[i]);
            
        }
        return answer;
    }
}