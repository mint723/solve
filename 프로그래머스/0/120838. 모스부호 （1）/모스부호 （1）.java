import java.util.*;

class Solution {
    public String solution(String letter) {
        String[] morse ={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Map<String, Character> map = new HashMap<>();
        for(int i=0; i<morse.length; i++){
            map.put(morse[i], (char)('a'+i));
        }
        String[] tmp = letter.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String alphabet : tmp){
            sb.append(map.get(alphabet));
        }
        
        return sb.toString();
    }
}