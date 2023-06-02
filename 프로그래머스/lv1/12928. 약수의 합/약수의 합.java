import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n!=0){
            HashSet<Integer> set = new HashSet<>();
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if(i*j==n){
                        set.add(i);
                        set.add(j);
                    }
                }
            }

            Iterator<Integer> it = set.iterator();
            while (it.hasNext()){
                answer+=it.next();
            }
        }
        return answer;
    }
}