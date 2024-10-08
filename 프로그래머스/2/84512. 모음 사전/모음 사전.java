class Solution {
    private int idx = 0;
    private int result = 0;
    private String target;
    private boolean found = false;

    public int solution(String word) {
        this.target = word;
        dfs("");
        return result;
    }

    private void dfs(String current) {
        if (found) return;
        
        for (char c : new char[]{'A', 'E', 'I', 'O', 'U'}) {
            String next = current + c;
            idx++;
            if (next.equals(target)) {
                result = idx;
                found = true;
                return;
            }
            if (next.length() < 5) {
                dfs(next);
            }
        }
    }
}
