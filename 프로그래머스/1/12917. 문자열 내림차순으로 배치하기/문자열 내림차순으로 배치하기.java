import java.util.*;

class Solution {
    public String solution(String s) {
        List<Character> list = new ArrayList<>();
        for (int i = 0; i<s.length(); i++){
            list.add(s.charAt(i));
        }
        Collections.sort(list, (o1,o2)->o2-o1);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            sb.append(list.get(i));
        }
        String answer = sb.toString();
        return answer;
    }
}