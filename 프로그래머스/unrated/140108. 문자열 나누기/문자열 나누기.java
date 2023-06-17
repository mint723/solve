import java.util.*;

class Solution {
    public int solution(String s) {
		Stack<Character> same = new Stack<>();
        Stack<Character> diff = new Stack<>();
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            if(same.isEmpty()){
                same.push(s.charAt(i));
            } else if (s.charAt(i)==same.peek()) {
                same.push(s.charAt(i));
            } else{
                diff.push(s.charAt(i));
            }

            if(same.size()!=0 && same.size()==diff.size()){
                same.clear();
                diff.clear();
                answer++;
            }
            if(i==s.length()-1 && same.size()!=diff.size()){
                answer++;
            }

        }
        return answer;
    }
}