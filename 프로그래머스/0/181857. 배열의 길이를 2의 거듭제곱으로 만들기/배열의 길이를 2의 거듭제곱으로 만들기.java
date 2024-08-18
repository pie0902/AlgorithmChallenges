class Solution {
    public int[] solution(int[] arr) {
            int len = arr.length;
            int two = 2;
            if(two==len||len==1||len==0){
                return arr;
            }
            while(two<len){
                two = two*2;
            }

            int newLen = two-len;
            int[] answer = new int[arr.length+newLen];
                
                for(int i = 0; i<answer.length; i++){
                    if(i<arr.length){
                        answer[i] = arr[i];     
                    }
                    else{
                        answer[i] = 0;
                    }
                }
            return answer;
        }
    }