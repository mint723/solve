import java.util.*;

class Solution {
    public int[] solution(int n, int m) {
        int max = Math.max(n,m);
        int min = Math.min(n,m);
        
        return new int[]{gcd(min,max), max*min/gcd(min,max)};
    }
    
    static int gcd(int min, int max){
        if(max%min == 0){
            return min;
        }
        return gcd(max%min, min);
    }
}