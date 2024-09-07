class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        int len = friends.length;
        //선물지수
        int[] giftIndex = new int[len];
        //교환 목록
        int[][] matrix = new int[len][len];
        
        //선물 지수 구하기
        for(int i = 0; i<len; i++){
            for(int j = 0; j<gifts.length; j++){
                String[] strs = gifts[j].split(" ");    
                if(friends[i].equals(strs[0])){
                    giftIndex[i]++;
                }
                else if(friends[i].equals(strs[1])){
                    giftIndex[i]--;
                }
            }
        }
        for(int i = 0; i<gifts.length; i++){
            int a = 0;
            int b = 0;
            for(int j = 0; j<len; j++){
                String[] strs = gifts[i].split(" ");    

                if(strs[0].equals(friends[j])){
                    a = j;
                }
                else if(strs[1].equals(friends[j])){
                    b = j;
                }
            }
            matrix[a][b]++;
        }
        int[] giftRank = new int[len];
        int max = Integer.MIN_VALUE;
        int cnt = 0;
        for(int i = 0; i<matrix.length; i++){
            cnt = 0;
            for(int j = 0; j<matrix[0].length; j++){
                if(i!=j){
                    if(matrix[i][j]>matrix[j][i]){
                        cnt++;
                    }
                    else if(matrix[i][j]>matrix[j][i]){
                        continue;
                    }
                    else if(matrix[i][j]==matrix[j][i]){
                        if(giftIndex[i]>giftIndex[j]){
                            cnt++;
                        }
                        else{
                            continue;
                        }
                    }
                }
            }
            giftRank[i] = cnt;
        }
        
        for(int i : giftRank){
            if(i>max){
                max = i;
            }
        }
        answer = max;
        
        return answer;
    }
}