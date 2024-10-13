import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String[] canS = {"aya", "ye", "woo", "ma"};
        String[] cantS = {"ayaaya", "yeye", "woowoo", "mama"};
        
        for(String word : babbling){
            boolean flag = true;
            
            for(int i=0; i<4; i++){
                if(word.contains(cantS[i]))
                    flag = false;
            }
            
            if(flag){
                for(int i=0; i<4; i++){
                    word = word.replace(canS[i], " ");
                }
            }
            
            if(word.trim().equals(""))
                answer++;
        }
        
        return answer;
    }
}