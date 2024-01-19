class Solution {
    public int solution(int[] numbers) {
        int[] copy = {1,2,3,4,5,6,7,8,9,0};
        int answer = 0;
        int cnt = 0;
        int len = numbers.length;
        for(int i = 0; i<copy.length;i++){
            for(int j = 0; j<len;j++){
                if(copy[i]==numbers[j]){
                    cnt++;
                    continue;
                }
            }
            if(cnt==0){
                answer = answer + copy[i];
                System.out.println(copy[i]);
            }
            else{
                cnt=0;
            }
        }
        return answer;
    }
}