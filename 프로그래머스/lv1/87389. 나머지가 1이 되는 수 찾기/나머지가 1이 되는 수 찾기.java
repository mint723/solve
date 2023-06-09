class Solution {
    public int solution(int n) {
        int num = 1;
        int answer = 0;
        while (answer == 0){
            if(n%num==1){
                answer = num;
            }
            num++;
        }
        return answer;
    }
}