class Solution {
    public int[] solution(int brown, int yellow) {
        int total = brown + yellow;
        //가로가 세로보다 커야함
         for(int i = 3; i<=total; i++){
            if(total%i == 0){
                int j = total/ i; //<- 세로길이
                if((i-2)*(j-2)==yellow){
                    return new int[]{j,i};
                }
            }
         }
        return null;
    }
}