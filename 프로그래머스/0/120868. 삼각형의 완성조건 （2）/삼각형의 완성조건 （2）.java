class Solution {   
    public int big(int a,int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
    public int small(int a,int b){
        if(a>b){
            return b;
        }
        else{
            return a;
        }
    }
    public int solution(int[] sides) {
        int answer = 0;
        int c = 0;
        int a = small(sides[0],sides[1]);
        int b = big(sides[0],sides[1]);
        //3 6
        //3 + 0 > 6
        //0 < 9
        while(c<=a+b){
            c++;
            if(a+c>b&&c<a+b){
                answer++;
            }
        }
        System.out.println(c);
        return answer;
    }
}