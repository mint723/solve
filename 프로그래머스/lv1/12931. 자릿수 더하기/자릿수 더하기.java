import java.util.*;

public class Solution {
    public int solution(int n) {
        String tmp = ""+n;
        int answer = 0;
        for(int i = 0; i<tmp.length(); i++){
            answer += tmp.charAt(i)-'0';
        }
        return answer;
    }
}