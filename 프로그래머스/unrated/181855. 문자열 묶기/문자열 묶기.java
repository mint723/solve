import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < strArr.length; i++) {
            hashMap.put(strArr[i].length(),0);
        }
        for (int i = 0; i < strArr.length; i++) {
            hashMap.put(strArr[i].length(),hashMap.get(strArr[i].length())+1);
        }
        Integer answer = Collections.max(hashMap.values());
        return answer;
    }
}