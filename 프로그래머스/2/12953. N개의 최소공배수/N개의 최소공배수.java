class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        if(arr.length==1) return arr[0];
        for(int i=1; i<arr.length; i++){
            answer = lcm(answer, arr[i], gcd(answer, arr[i]));
        }
        return answer;
    }
    
    static int gcd(int x, int y){
        if(y == 0) return x;
        return gcd(y, x%y);
    }
    
    static int lcm(int x, int y, int gcd){
        return (x/gcd) * (y/gcd) * gcd;
    }
}