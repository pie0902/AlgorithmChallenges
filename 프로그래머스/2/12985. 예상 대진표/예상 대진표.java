class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        //2 4 8 16
        //7 8  //3 4
        //3 4  //1 2
        //2  //1
        
        while(a!=b){
            a = (a+1) /2;
            b = (b+1) /2;
            answer++;
        }

        return answer;
    }
}