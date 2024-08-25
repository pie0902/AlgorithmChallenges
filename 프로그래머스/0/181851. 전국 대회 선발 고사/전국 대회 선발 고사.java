import java.util.Arrays;
class Solution {
    
    public static class Total implements Comparable<Total>{
        int r;
        boolean b;
        int index;
        public Total(int r, boolean b,int index){
            this.r = r;
            this.b = b;
            this.index = index;
        }
        @Override
        public int compareTo(Total other){
            return Integer.compare(this.r,other.r);   
        }
    }
    
    
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int len = 0;
       
        for(int i = 0; i<rank.length; i++){
            if(attendance[i]){
                len++;
            }
        }
        Total[] t = new Total[len];
        int cnt = 0;
        for(int i = 0; i<rank.length;i++){
            if(attendance[i]){
                t[cnt++] = new Total(rank[i],attendance[i],i);
            }
        }
        Arrays.sort(t);
        int[] ary = new int[3];
        int cnt2 = 0;
        for(int i = 0; i<3; i++){
            ary[i] = t[i].index;
        }
        for(int i : ary){
            System.out.println(i);
        }
        answer = (10000*ary[0])+(ary[1]*100)+ary[2];
        return answer;
    }
}