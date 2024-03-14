import java.util.HashMap;
import java.util.Map;
class Solution {
    public String solution(String letter) {
        String[] morseCodes = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
            "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",
            "..-", "...-", ".--", "-..-", "-.--", "--.."
        };

        Map<String, Character> morseMap = new HashMap<>();
        char c = 'a';
        for (String code : morseCodes) {
            morseMap.put(code, c++);
        }

        StringBuilder decoded = new StringBuilder();
        String[] words = letter.split(" ");
        for (String word : words) {
            decoded.append(morseMap.get(word));
        }

        return decoded.toString();
    }
}