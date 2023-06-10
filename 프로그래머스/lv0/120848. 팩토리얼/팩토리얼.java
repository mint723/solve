class Solution {
    public int solution(int n) {
        int answer = 1;
        int index = 1;
        while(answer<=n){
            answer=1;
            for (int i = 1; i <= index; i++) {
                answer*=i;
            }
            index++;
        }
        return index-2;
    }
}