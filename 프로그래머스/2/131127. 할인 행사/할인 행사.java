class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        //일반적 풀이
        //0번 인덱스부터 -10 인덱스까지 가면서 want배열의 모든것을 충족하는지 카운트
        int len = 10;
        int start = 0;
        int t = 0;
        
        while(discount.length+1!=len){
            //System.out.println(discount.length + "그리고" + len);
            int[] copy = new int[number.length];
            for(int i = 0; i<want.length; i++){
                for(int j=start; j<len; j++){
                    if(want[i].equals(discount[j])){
                        copy[i]++;
                    }
                }
            }
            for(int i = 0; i<number.length; i++){
                if(copy[i]!=number[i]){
                    answer--;
                    break;   
                }
            }
            answer++;
            start++;
            len++;
            //System.out.println();  
        }
        return answer;
    }
}