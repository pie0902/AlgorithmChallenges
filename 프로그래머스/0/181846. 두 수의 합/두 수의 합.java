import java.math.BigInteger;
class Solution {
    public String solution(String a, String b) {
        BigInteger aa = new BigInteger(a);
        BigInteger bb = new BigInteger(b);
        BigInteger result = aa.add(bb);
        String answer = result.toString();
        
        return answer;
    }
}