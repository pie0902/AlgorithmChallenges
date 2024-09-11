import java.util.Stack;

class Solution {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();
        
        // 문자열을 한 문자씩 처리
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            
            // 스택이 비어 있지 않고, 스택의 최상단 문자와 현재 문자가 같으면 제거
            if (!stack.isEmpty() && stack.peek() == currentChar) {
                stack.pop(); // 짝이 맞으므로 제거
            } else {
                stack.push(currentChar); // 짝이 아니면 스택에 추가
            }
        }
        
        // 스택이 비어 있으면 모든 문자가 짝지어 제거됨
        return stack.isEmpty() ? 1 : 0;
    }
}
