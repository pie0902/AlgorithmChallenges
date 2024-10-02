import java.util.*;
class Solution{
    public static int find(List<List<Integer>> list,int k){
        int cnt = 0;
        for(int i = 0; i<list.size(); i++){
            if(k>=list.get(i).get(0)){
                k = k - list.get(i).get(1);
            }
            else{
                break;
            }
            cnt++;
        }
        return cnt;
    }
    public static void dfs(int[][] d, boolean[] visited, List<List<Integer>> list,int k,List<Integer> count){
        if(list.size()==d.length){
            int copy = k;
            count.add(find(list,copy));
            return;
        }
        for(int i = 0; i<d.length; i++){
            if(!visited[i]){
                visited[i] = true;
                List<Integer> temp = new ArrayList<>();
                temp.add(d[i][0]);
                temp.add(d[i][1]);
                list.add(temp);
                dfs(d, visited, list,k,count);
                visited[i] = false;
                list.remove(list.size() - 1);
            }
        }
    }
    
    public int solution(int k, int[][] d) {
        //8가지 경로의 k가 0이 될때까지의 모든 경로를 구한다.
        //k가 최소필요피로도보다 크거나 같아야 진입 가능한 조건설정
        boolean[] visited = new boolean[d.length];
        List<Integer> count = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        int answer = 0;
        dfs(d,visited,list,k,count);
        for(int i : count){
            if(i>answer){
                answer = i;
            }
        }
        
        return answer;
    }
}