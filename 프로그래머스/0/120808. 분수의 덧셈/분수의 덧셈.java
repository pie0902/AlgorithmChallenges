class Solution {
    
    
    static class Result{
        int a = 0;
        int b = 0;
        public Result(int a, int b){
            this.a = a;
            this.b = b;
        }
    }
    static int gcd(int a , int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }

    static int lcm(int a,int b){
        return (a*b)/gcd(a,b);
    }
    static Result res(int n1,int d1,int n2, int d2){
        int lcm = lcm(d1,d2);
        int top = n1 * (lcm/d1) + n2 * (lcm/d2);
        int bottom = lcm;
        
        int gcd = gcd(top,bottom);
        top /= gcd;
        bottom /= gcd;
        
        return new Result(top,bottom);
    }
    public int[] solution(int n1, int d1, int n2, int d2) {
        Result result = res(n1,d1,n2,d2);
        return new int[]{result.a,result.b};
    }
}