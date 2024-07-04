import java.util.Arrays;
class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        char[] copy = dartResult.toCharArray();
        String temp = "";
        for(int i = 0; i<copy.length; i++){    
            if(i!=0&&i!=copy.length-1 && Character.isDigit(copy[i])&&!Character.isDigit(copy[i-1])){
                temp = temp + ',';
                temp = temp + copy[i];
            }
            else{
                temp = temp + copy[i];
            }
        }
        String[] ary = temp.toString().split(",");
        int cnt = 0;
        int idx = 0;
        int num[] = new int[3];
        for(String str : ary){
            char[] copy2 = str.toCharArray();
            String value = "";
            cnt++;
            for(char c : copy2){
                if(Character.isDigit(c)){
                    value += c;
                }
                else{
                    if(c=='S'){
                        num[idx] += Math.pow(Integer.parseInt(value),1);    
                    }
                    else if(c=='D'){
                        num[idx] += Math.pow(Integer.parseInt(value),2);
                    }
                    else if(c=='T'){
                        num[idx] += Math.pow(Integer.parseInt(value),3);
                    }
                }
                    if(c == '*'){
                        num[idx] *= 2;  
                        if (idx > 0) {  
                            num[idx-1] *= 2; 
                        }
                    }
                    else if(c == '#'){
                        num[idx] = num[idx] * -1;
                    }
            }
            //System.out.println(num[idx]);
            idx++;
        }
        int sum = 0;
        for(int i : num){
            sum += i;
        }
        System.out.println(sum);
        answer = sum;
        return answer;
    }
}