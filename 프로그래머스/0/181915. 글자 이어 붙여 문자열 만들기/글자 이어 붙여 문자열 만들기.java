class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        int len = my_string.length();
        int len2 = index_list.length;
        System.out.println(len2);
        char[] copy = my_string.toCharArray();
        for(int i = 0; i<len2 ; i++){
            answer += copy[index_list[i]];
        }
        
        
        return answer;
    }
}