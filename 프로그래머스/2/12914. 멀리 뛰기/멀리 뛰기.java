import java.util.*;

class Solution {
    public long solution(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        for(int i=2; i<=n+1; i++){
            list.add((list.get(i-1)+list.get(i-2))%1234567);
        }
        return list.get(n+1);
    }
}