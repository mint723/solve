import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        while(n!=0){
            answer+=1;
            
            if(String.valueOf(answer).contains("3") || answer%3 ==0){
                continue;
            }
            
            n--;

        }
        
        return answer;
    }
}