import java.util.*;
class Solution {
    public long solution(int n) {
        List<Long> list = new ArrayList<>();
        list.add(1L);
        list.add(1L);
        for(int i = 2; i<=n; i++){
            list.add((list.get(i-1) + list.get(i-2))%1234567);
        }
        return list.get(n);
    }
}