class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean[][] table = {{true,true,true,true},{true,false,true,false},{false,true,true,false},{false,false,false,false}};
        boolean answer = true;
        boolean t1 = false;
        boolean t2 = false;
        t1 = (x1&&x2) ? true : t1;
        t1 = (x1&&!x2) ? true : t1;
        t1 = (!x1&&x2) ? true : t1;
        t1 = (!x1&&!x2) ? false : t1;
        t2 = (x3&&x4) ? true : t2;
        t2 = (x3&&!x4) ? true : t2;
        t2 = (!x3&&x4) ? true : t2;
        t2 = (!x3&&!x4) ? false : t2;
        int num = 0;
        for(int i = 0; i<table.length; i++){
            if(table[i][0]==t1&&table[i][1]==t2){
                num = i;
                break;
            }
        }
        answer = table[num][3];
        
        return answer;
    }
}