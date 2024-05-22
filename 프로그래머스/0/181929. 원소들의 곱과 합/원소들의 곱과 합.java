class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int a = 0;
        int b = 1;
        for(int i = 0; i< num_list.length; i++){
            a += num_list[i];
            b *= num_list[i];
        }
        a = a*a;
        System.out.println(a);
        System.out.println(b);
        if(a>b){
            answer = 1;
        }
        else{
            answer = 0;
        }
        return answer;
    }
}