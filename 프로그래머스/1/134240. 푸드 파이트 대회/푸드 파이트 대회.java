class Solution {
    public String solution(int[] food) {
        StringBuilder a = new StringBuilder();
        
        // 배열을 반으로 쪼개서 한 줄 만들기
        for (int i = 1; i < food.length; i++) {
            int count = food[i] / 2;
            for (int j = 0; j < count; j++) {
                a.append(i);
            }
        }
        
        // 물을 추가하고 뒤집은 문자열을 붙이기
        String reversed = a.reverse().toString();
        a.reverse().append(0).append(reversed);
        
        return a.toString();
    }
}