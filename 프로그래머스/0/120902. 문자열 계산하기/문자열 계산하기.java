class Solution {
    public int solution(String my_string) {
        
        String[] a = my_string.split(" ");
        int answer = Integer.parseInt(a[0]);
        for(int i = 0; i<a.length;i++){
            if(a[i].equals("+")){
                answer = answer + Integer.parseInt(a[i+1]);
            }
            else if(a[i].equals("-")){
                answer = answer - Integer.parseInt(a[i+1]);
            }
        }
        return answer;
    }
}