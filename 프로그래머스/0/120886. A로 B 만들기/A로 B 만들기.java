import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {

        char[] a = before.toCharArray();
        char[] b = after.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        String sortedBefore = new String(a);
        String sortedAfter = new String(b);
        return sortedBefore.equals(sortedAfter) ? 1 : 0;
    }
}