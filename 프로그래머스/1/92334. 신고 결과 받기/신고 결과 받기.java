import java.util.*;
class Solution {
        public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        // 1. 각 유저가 신고당한 횟수를 저장할 Map
        Map<String, Integer> reportCount = new HashMap<>();
        
        // 2. 각 유저가 신고한 사람을 저장할 Map
        Map<String, Set<String>> userReports = new HashMap<>();
        
        // id_list에 있는 유저 초기화
        for (String user : id_list) {
            reportCount.put(user, 0);
            userReports.put(user, new HashSet<>());
        }
        
        // 3. 중복 신고를 방지하며 신고 내역 처리
        for (String r : report) {
            String[] parts = r.split(" ");
            String reporter = parts[0];
            String reported = parts[1];
            
            // reporter가 이미 해당 유저를 신고한 적이 없을 경우에만 처리
            if (!userReports.get(reporter).contains(reported)) {
                userReports.get(reporter).add(reported);  // 신고 기록에 추가
                reportCount.put(reported, reportCount.get(reported) + 1); // 신고당한 횟수 증가
            }
        }
        
        // 4. k번 이상 신고당한 유저들을 찾아서 처리
        Set<String> suspendedUsers = new HashSet<>();
        for (Map.Entry<String, Integer> entry : reportCount.entrySet()) {
            if (entry.getValue() >= k) {
                suspendedUsers.add(entry.getKey());  // 정지된 유저 저장
            }
        }
        
        // 5. 각 유저가 받은 메일 횟수 계산
        for (int i = 0; i < id_list.length; i++) {
            String user = id_list[i];
            Set<String> reportedUsers = userReports.get(user);  // 유저가 신고한 목록
            
            int mailCount = 0;
            for (String reported : reportedUsers) {
                if (suspendedUsers.contains(reported)) {
                    mailCount++;  // 신고한 유저가 정지되었으면 메일 횟수 증가
                }
            }
            answer[i] = mailCount;  // 최종 메일 횟수 저장
        }
        
        return answer;
    }
}