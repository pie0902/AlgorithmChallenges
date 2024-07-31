import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        int[] xCount = new int[10];
        int[] yCount = new int[10];

        // X와 Y의 각 숫자의 빈도를 계산
        for (char c : X.toCharArray()) {
            xCount[c - '0']++;
        }
        for (char c : Y.toCharArray()) {
            yCount[c - '0']++;
        }

        // 공통된 숫자의 최소 빈도만큼 결과 리스트에 추가
        StringBuilder result = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            int minCount = Math.min(xCount[i], yCount[i]);
            for (int j = 0; j < minCount; j++) {
                result.append(i);
            }
        }

        // 결과가 비어 있으면 -1 반환
        if (result.length() == 0) {
            return "-1";
        }

        // 결과가 0으로만 구성되어 있으면 0 반환
        if (result.charAt(0) == '0') {
            return "0";
        }

        // 최종 결과 문자열 반환
        return result.toString();
    }
}