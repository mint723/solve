import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Queue<Character> q = new LinkedList<>();
        for(char c : s.toCharArray()){
            q.offer(c);
        }
        
        for(int i=0; i<s.length(); i++){
            q.offer(q.poll());
            String str = q.stream().map(String::valueOf).collect(Collectors.joining(""));
            if(isAnswer(str))
                answer++;
        }
        return answer;
    }
    
    boolean isAnswer(String s){
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '['){
                stack.push(']');
            }else if(c == '('){
                stack.push(')');
            }else if(c == '{'){
                stack.push('}');
            }else{
                if(!stack.isEmpty() && stack.peek() == c)
                    stack.pop();
                else
                    return false;
            }
        }
        return stack.size() == 0;
    }
}