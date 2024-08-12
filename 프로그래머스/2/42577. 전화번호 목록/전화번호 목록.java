import java.util.*;



class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashMap<String,Boolean> book = new HashMap<>();
        for(String phone : phone_book){
            book.put(phone,true);
        }
        for(String phone : phone_book){
            String prefix = "";
            for(int i = 0; i<phone.length()-1;i++){
                prefix += phone.charAt(i);
                if(book.containsKey(prefix)){
                    return false;
                }
                
            }
        }
        
        
        return answer;
    }
}