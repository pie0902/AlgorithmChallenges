import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        int left = -1, right = -1;
        String[] answer = {};
        
        // 왼쪽에서 'l' 찾기
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                left = i;
                break;
            }
        }
        
        // 오른쪽에서 'r' 찾기
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("r")) {
                right = i;
                break;
            }
        }

        if (left != -1 && (right == -1 || left < right)) {
            // 'l'이 먼저 나왔을 경우, 왼쪽 부분 반환
            answer = Arrays.copyOfRange(str_list, 0, left);
        } else if (right != -1 && (left == -1 || right < left)) {
            // 'r'이 먼저 나왔을 경우, 오른쪽 부분 반환
            answer = Arrays.copyOfRange(str_list, right + 1, str_list.length);
        }
        
        return answer;
    }
}
