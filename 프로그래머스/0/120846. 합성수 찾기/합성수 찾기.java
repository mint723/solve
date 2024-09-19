class Solution {
    public int solution(int n) {
        int answer=0;
        for(int i=4; i<=n; i++){
            if(isAnswer(i)) answer++;
        }
        return answer;
    }
    
    boolean isAnswer(int m){
        if((m%3==0 && m>3) || (m%2==0 && m>2)) return true;
        return false;
    }
}