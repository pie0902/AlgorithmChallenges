class Solution {
    public static int gcd(int a, int b){
        while(b!=0){
            int temp =b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public static boolean nd(int[] arr, int n){
        for(int i : arr){
            if(i%n ==0){
                return false;
            }
        }
        return true;
    }
    
    public int solution(int[] arrayA, int[] arrayB) {
        int answer = 0;
        int gcdA = arrayA[0];
        int gcdB = arrayB[0];
        
        for(int i = 1; i<arrayA.length; i++){
            gcdA = gcd(gcdA,arrayA[i]);
        }
        for(int i = 1; i<arrayB.length; i++){
            gcdB = gcd(gcdB,arrayB[i]);
        }
        if(nd(arrayB,gcdA)){
            if(answer<gcdA){
                answer = gcdA;
            }
        }
        if(nd(arrayA,gcdB)){
            if(answer<gcdB){
                answer =gcdB;
            }
        }
        
        
        
        return answer;
    }
}