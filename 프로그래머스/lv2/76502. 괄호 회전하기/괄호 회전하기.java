import java.util.*;

class Solution {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();
        //정답
        int answer = 0;
        //문자열 회전
        for (int i = 0; i < s.length(); i++) {
            String tmp = s.substring(i);
            tmp+=s.substring(0,i);
            stack.clear();
            //괄호 확인
            for (int j = 0; j < tmp.length(); j++) {
                if(stack.size()>0&&
                        ((stack.peek()=='[' && tmp.charAt(j)==']')||
                                (stack.peek()=='(' && tmp.charAt(j)==')')||
                                (stack.peek()=='{' && tmp.charAt(j)=='}')
                        )){
                    stack.pop();
                }else {
                    stack.push(tmp.charAt(j));
                }
            }
            //stack.size()==0이면 정답 +1
            if(stack.size()==0){
                answer++;
            }
        }
        return answer;
    }
}