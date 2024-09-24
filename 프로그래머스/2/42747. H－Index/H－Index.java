import java.util.*;



class Solution {
    public static void mergeSort(int[] arr, int left, int right){
        if (left >= right) {
            // 배열이 나눌 수 없을 정도로 작을 때 재귀 호출 종료
            return;
        }
        if(left<right){
            int mid = (left+right)/2;
            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);
            merge(arr,left,mid,right);
        }
    }
    public static void merge(int[] arr,int left,int mid, int right){
        int n1 = mid - left + 1;
        int n2 = right - mid;
        
        int[] L = new int[n1];
        int[] R = new int[n2];
        
        for(int i = 0; i<n1; i++){
            L[i] = arr[left+i];
        }
        for(int i = 0; i<n2; i++){
            R[i] = arr[mid+1+i];
        }
        int i = 0;
        int j = 0;
        int k = left;
        while(i<n1&&j<n2){
            if(L[i]<=R[j]){
                arr[k] = L[i];
                i++;
            }
            else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k] = L[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    
    
    
    public int solution(int[] citations) {
        int answer = 0;
        int left = 0;
        int right = citations.length-1;
        mergeSort(citations,left,right);
        int idx = 0;
        for(int i = citations.length-1; i>=0; i--){
            idx++;
            System.out.println(citations[i] + "그리고 " + idx);
            if(citations[i]>=idx){
                 continue;
            }
            else{
                idx--;
                break;
            }
        }
        answer = idx;
        return answer;
    }
}