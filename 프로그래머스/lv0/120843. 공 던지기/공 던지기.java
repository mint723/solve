class Solution {
    public int solution(int[] numbers, int k) {
        int n = 2*(k-1);
        if (k==1){
            n=0;
        }
        else {
            while (n>numbers.length){
                n-=numbers.length;
            }
        }

        int answer = numbers[n];
        return answer;
    }
}