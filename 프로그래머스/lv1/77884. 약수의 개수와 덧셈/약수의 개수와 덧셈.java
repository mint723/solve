class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            if(check(i)){
                answer+=i;
            }else{
                answer-=i;
            }
        }
        return answer;
    }
    
    static boolean check(int num){
        int n =(int)Math.sqrt(num);
        if(n*n==num){
            return false;
        }
        return true;
    }
}