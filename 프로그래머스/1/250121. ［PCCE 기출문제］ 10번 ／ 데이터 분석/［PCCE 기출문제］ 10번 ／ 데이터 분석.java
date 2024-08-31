import java.util.*;

class Solution {
    public static class Ai {
        int code;
        int date;
        int max;
        int re;
        
        public Ai(int code, int date, int max, int re) {
            this.code = code;
            this.date = date;
            this.max = max;
            this.re = re;
        }
    }
    
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<Ai> list = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            Ai ai = new Ai(data[i][0], data[i][1], data[i][2], data[i][3]);
            list.add(ai);
        }
        
        List<Ai> filteredList = new ArrayList<>();
        
        // 데이터 필터링
        for (Ai ai : list) {
            if (ext.equals("date") && ai.date < val_ext) {
                filteredList.add(ai);
            } else if (ext.equals("code") && ai.code < val_ext) {
                filteredList.add(ai);
            } else if (ext.equals("maximum") && ai.max < val_ext) {
                filteredList.add(ai);
            } else if (ext.equals("remain") && ai.re < val_ext) {
                filteredList.add(ai);
            }
        }

        // 데이터 정렬
        filteredList.sort((a, b) -> {
            if (sort_by.equals("date")) {
                return Integer.compare(a.date, b.date);
            } else if (sort_by.equals("code")) {
                return Integer.compare(a.code, b.code);
            } else if (sort_by.equals("maximum")) {
                return Integer.compare(a.max, b.max);
            } else if (sort_by.equals("remain")) {
                return Integer.compare(a.re, b.re);
            }
            return 0;  // 기본값 (사실상 이 줄에 도달하지 않음)
        });

        // 결과 배열 생성 및 반환
        int[][] answer = new int[filteredList.size()][4];
        for (int i = 0; i < filteredList.size(); i++) {
            Ai ai = filteredList.get(i);
            answer[i][0] = ai.code;
            answer[i][1] = ai.date;
            answer[i][2] = ai.max;
            answer[i][3] = ai.re;
        }

        return answer;
    }
}
