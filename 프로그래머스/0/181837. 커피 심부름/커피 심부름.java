class Solution {
    public int solution(String[] order) {
        int answer = 0;
        String[] menu = {"cafelatte","americano","anyting"};
        for(int i = 0; i<order.length; i++){
            
            if(order[i].contains("americano")){
                answer += 4500;
                System.out.println(answer);
            }
            else if(order[i].contains("cafelatte")){
                answer += 5000;
                System.out.println(answer);
            }
            else if(order[i].equals("anything")){
                answer += 4500;
                System.out.println(answer);
            }
            
        }
        return answer;
    }
}