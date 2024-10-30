class Solution {
    public int solution(int s) {
        int answer = 0;
        
        while (s > 0) {
            int now = s % 10; // 현재 자릿수 값
            int next = s/10;
            if (now > 5) {
                System.out.print("5보다 큼 ");
                answer += 10 - now;  // 현재 자릿수를 올리기 위해 필요한 버튼 횟수
                s += 10 - now;       // 올림 적용
            } else if(now<5) {
                System.out.print("5보다 작음 ");
                answer += now;       // 현재 자릿수를 내리기 위해 필요한 버튼 횟수
                s -= now;            // 내림 적용
            }else{
                if(next %10 >=5){
                    answer += 10-now;
                    s += 10 - now;
                }else{
                    answer+=now;
                    s -=now;
                }
            }

            s /= 10; // 다음 자릿수로 이동
        }
        
        return answer;
    }
}
