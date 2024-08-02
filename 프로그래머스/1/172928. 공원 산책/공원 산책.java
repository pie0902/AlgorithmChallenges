class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = {};
        String[][] parkPad = new String[park.length][park[0].length()];
        for(int i = 0; i<park.length; i++){
            parkPad[i] = park[i].split("");    
        }
        //시작 위치
        int[] start = {0,0};
        for(int i = 0; i<park.length; i++){
            for(int j = 0; j<park[0].length(); j++){
                if(parkPad[i][j].equals("S")){
                    start[0] = i;
                    start[1] = j;
                }
            }
        }
        int row = start[0];
        int col = start[1];

        for(String route : routes){
            char point = route.charAt(0);
            int len = route.charAt(2)-'0';
            int row2 = row;
            int col2 = col;
            for(int i = 0; i<len; i++){
                System.out.println(row2 + "그리고" + col2);
                if(point == 'N'){
                    row2--;   
                    System.out.println("N");
                }
                else if(point == 'W'){
                    col2--;
                    System.out.println("W");
                }
                else if(point == 'S'){
                    row2++;
                    System.out.println("S");
                }
                else if(point == 'E'){
                    col2++;
                    System.out.println("E");
                }
                if(row2<0||row2>park.length-1||col2<0||col2>park[0].length()-1){
                    row2 = row;
                    col2 = col;
                    break;
                }
                if(parkPad[row2][col2].equals("X")){
                    row2 = row;
                    col2 = col;
                    break;
                }
            }
            row = row2;
            col = col2;
            }
            start[0] = row;
            start[1] = col;     
            System.out.println(start[0] + "," + start[1]);
            return start;
        }
}