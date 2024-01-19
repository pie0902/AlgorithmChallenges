class Solution {
    public String solution(int n) {
        String answer = "";
        char[] arr = new char[n];
        for(int i =0; i<n; i++){
            if(i%2==0){
                arr[i]='수';
            }
            else{
                arr[i]='박';
            }
            System.out.println(arr[i]);
        }
        for(int i =0; i<n;i++){
            answer = answer + arr[i];
        }
        return answer;
    }
}