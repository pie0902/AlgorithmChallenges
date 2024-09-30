import java.util.LinkedList;

class Solution {
    // 캐시에서 도시의 위치를 확인하는 함수
    public static int check(String[] ary, String city){
        for(int i = 0; i < ary.length; i++){
            if (ary[i] != null && ary[i].equals(city)) { // null 체크 추가
                return i;
            }
        }
        return -1;  // 캐시에 없는 경우
    }
    
    // 캐시를 LRU 방식으로 업데이트하는 함수
    public static String[] update(String[] ary, int idx){
        String temp = ary[idx];
        for(int i = idx; i > 0; i--){
            ary[i] = ary[i-1];
        }
        ary[0] = temp;
        return ary;
    }
    
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        LinkedList<String> cache = new LinkedList<>(); // 캐시를 LinkedList로 관리
        
        if (cacheSize == 0) {
            // 캐시 크기가 0일 경우 무조건 캐시 미스 발생
            return cities.length * 5;
        }
        
        for (int i = 0; i < cities.length; i++) {
            String city = cities[i].toLowerCase();  // 도시 이름을 소문자로 통일
            
            // 캐시에 있는지 확인
            if (cache.contains(city)) {
                // 캐시 히트: 도시가 캐시에 있는 경우
                cache.remove(city);  // 해당 도시를 제거하고
                cache.addFirst(city); // 가장 앞으로 이동 (LRU 적용)
                answer += 1;  // 캐시 히트 실행 시간
            } else {
                // 캐시 미스: 도시가 캐시에 없는 경우
                answer += 5;  // 캐시 미스 실행 시간
                
                if (cache.size() == cacheSize) {
                    // 캐시가 가득 차면 가장 오래된 항목 제거
                    cache.removeLast();
                }
                // 새 도시를 캐시의 맨 앞으로 추가
                cache.addFirst(city);
            }
        }
        
        return answer;
    }
}
