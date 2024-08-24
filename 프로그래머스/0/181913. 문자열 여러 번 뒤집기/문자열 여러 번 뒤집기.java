class Solution {
    public String solution(String my_string, int[][] q) {
        for(int i = 0; i<q.length;i++){
            String temp = "";
            for(int j = q[i][1]; j>= q[i][0]; j--){
                temp += my_string.charAt(j);
            }
            String s = my_string.substring(0, q[i][0]);
            String e = my_string.substring(q[i][1]+1);
            my_string = s + temp + e;
        }
    
        return my_string;
    }
}