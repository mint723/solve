class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;
        long max = 1_000_000_000L * 100_000L;
        long min = 0;
        long mid = max/2;
        
        while(min<=max){
            long count = 0;
            for(int i=0; i<times.length; i++){
                count += mid/times[i];
            }
            if(count>=n){
                max = mid - 1;
            }else{
                min = mid + 1;
            }
            mid = (max+min)/2;
        }
        
        return min;
    }
}