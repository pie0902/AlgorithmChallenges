class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        boolean i = false;
        boolean p = false;
        for(String[] ids : db){
            for(String id : ids){
                if(id_pw[0].equals(id)){
                        i = true;    
                }
                if(id_pw[1].equals(id)){
                        p = true;   
                }
            }
            if(i==false){
                answer = "fail";
                p = false;
            }
            if(i==true&&p==true){
                answer = "login";
                break;
            }
            else if(i==true&&p==false){
                answer = "wrong pw";
                break;
            }

        }
        return answer;
    }
}