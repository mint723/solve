class Solution {
    public long solution(long n) {
        long tmp = 0;
        long cycle = 0;
        while (tmp<n){
            tmp = cycle;
            tmp = tmp*tmp;
            cycle++;
        }

        long answer = (tmp==n)?cycle*cycle:-1;
        return answer;
    }
}