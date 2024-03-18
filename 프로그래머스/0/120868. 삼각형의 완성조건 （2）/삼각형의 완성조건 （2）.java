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
        int idx = 1;
        int t = 0;
        int one = small(sides[0],sides[1]);
        int two = big(sides[0],sides[1]);
        while(one+idx<one+two){ 
        t = one + idx;
         if(t>two){  
            answer++;
         }
         idx++;
        }
        System.out.println(idx);
        System.out.println(answer);
        
        
        return answer*2+1;
    }
}