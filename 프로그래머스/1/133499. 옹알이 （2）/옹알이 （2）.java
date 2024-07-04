class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] strs = {"aya","ye","woo","ma"};
        
        for(String word: babbling){
            //ayaye
            String temp = word;
            String prev = "";
            boolean can = true;
            while(!temp.isEmpty()&&can){
                boolean found = false;
                for(String speak : strs){
                    if(temp.startsWith(speak)&&!speak.equals(prev)){
                        //1ayaye.aya&&aya!=preve
                        //2ye&&ye !- preve
                        temp = temp.substring(speak.length());
                        //1aya .ye
                        //2ye. 
                        prev = speak;
                        //1aya
                        //2ye
                        found = true;
                        break;
                    }
                }
                if(!found){
                    can = false;
                }
            }
            if(temp.isEmpty() && can){
            answer++;
            //1
            }
        }
        return answer;
    }
}