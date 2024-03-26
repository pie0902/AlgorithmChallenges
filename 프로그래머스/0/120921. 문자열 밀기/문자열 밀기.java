class Solution {
    public static int right(String a,String b) {
        int idx = 0;
        char[] copy = a.toCharArray();
        while (!a.equals(b)) {
            idx++;
            if(idx>a.length()){
                return -1;
            }
            char lastNum = copy[copy.length - 1];
            for (int i = copy.length - 1; i > 0; i--) {
                copy[i] = copy[i - 1];
            }
            copy[0] = lastNum;
            a = java.lang.String.valueOf(copy);
        }
        return idx;
    }
    public int solution(String A, String B) {
        int answer = right(A,B);
        return answer;
    }
}