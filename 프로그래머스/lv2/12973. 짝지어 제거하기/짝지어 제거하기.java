import java.util.*;

class Solution
{
    public int solution(String s)
    {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(stack.size()>0){
                if(stack.peek()!=s.charAt(i)){
                    stack.push(s.charAt(i));
                }else{
                    stack.pop();
                }
            }else{
                stack.push(s.charAt(i));
            }
        }
        
        int answer = (stack.size()==0)?1:0;
        return answer;
    }
}