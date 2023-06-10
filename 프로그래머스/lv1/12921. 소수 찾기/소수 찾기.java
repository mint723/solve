class Solution {
    public int solution(int n) {
         int answer = 0;
        for (int i = 2; i <= n; i++) {
            if(prime(i)){
                answer++;
            }
        }
        return answer;
    }
    
    static boolean prime(int m){
        for (int i = 2; i <= (int)Math.sqrt(m); i++) {
            if(m%i==0){
                return false;
            }
        }
        return true;
    }
}