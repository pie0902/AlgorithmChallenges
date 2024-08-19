class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[5];
        for(int[] i : queries){
            int temp = arr[i[0]];
            arr[i[0]] = arr[i[1]];
            arr[i[1]] = temp;
        }
        return arr;
    }
}