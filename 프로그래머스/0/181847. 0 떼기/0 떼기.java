class Solution {
    public String solution(String n_str) {
        String answer = "";
        //조건1 앞에 0 이면 다 넘겨버린다
        //조건2 0을 카운트하고 그 인덱스만큼 잘라버린다.
        int cnt = 0;
        char[] copy = n_str.toCharArray();
        for(int i = 0; i<n_str.length(); i++){
            if(copy[i]=='0'){
                cnt++;
            }
            else{
                break;
            }
        }
        System.out.println(cnt);
        answer = n_str.substring(cnt);
        return answer;
    }
}