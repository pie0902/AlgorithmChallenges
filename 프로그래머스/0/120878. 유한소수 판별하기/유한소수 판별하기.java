class Solution {
    static int v(int a, int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    
    
    public int solution(int a, int b) {
        int answer = 0;
        int gcd = v(a,b);
        a = a/gcd;
        b = b/gcd;
        while(b%2==0) b = b/2;
        while(b%5==0) b = b/5;
        
        answer = (b==1) ? 1 : 2;
        System.out.println(a+"zz"+b);
        return answer;
    }
}