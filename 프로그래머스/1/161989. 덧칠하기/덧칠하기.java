class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        int cur = section[0];
        
        for(int i=0; i<section.length; i++){
            if(cur + m > section[i])
                continue;
            
            cur = section[i];
            answer++;
        }
        
        return answer;
    }
}