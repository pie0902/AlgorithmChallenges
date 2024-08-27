class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] dice = {a,b,c,d};
        int[] count = new int[7];
        // 주사위 값들을 카운트 배열에 기록
        for (int i = 0; i < dice.length; i++) {
            count[dice[i]]++;
        }
        // 4개가 모두 같을 때
        for (int i = 1; i <= 6; i++) {
            if (count[i] == 4) {
                return 1111 * i;
            }
        }
        // 3개가 같고 1개가 다를 때
        for (int i = 1; i <= 6; i++) {
            if (count[i] == 3) {
                for (int j = 1; j <= 6; j++) {
                    if (count[j] == 1) {
                        return (10 * i + j) * (10 * i + j);
                    }
                }
            }
        }
        // 2개씩 두 쌍이 같을 때
        int firstPair = 0, secondPair = 0;
        for (int i = 1; i <= 6; i++) {
            if (count[i] == 2) {
                if (firstPair == 0) {
                    firstPair = i;
                } else {
                    secondPair = i;
                    return (firstPair + secondPair) * Math.abs(firstPair - secondPair);
                }
            }
        }

        

        // 2개가 같고 나머지 두 값이 서로 다를 때
        for (int i = 1; i <= 6; i++) {
            if (count[i] == 2) {
                int firstSingle = 0, secondSingle = 0;
                for (int j = 1; j <= 6; j++) {
                    if (count[j] == 1) {
                        if (firstSingle == 0) {
                            firstSingle = j;
                        } else {
                            secondSingle = j;
                            return firstSingle * secondSingle;
                        }
                    }
                }
            }
        }

        //===============================
        //===============================
        
        int min = Integer.MAX_VALUE;
        count = new int[7];
        for(int i = 1; i<=6; i++){
            for(int j = 0; j<dice.length; j++){
                if(i==dice[j]){
                    return i;
                }
            }
        }
        return answer;
    }
}