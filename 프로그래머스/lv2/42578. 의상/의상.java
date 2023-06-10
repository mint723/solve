import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < clothes.length; i++) {
            if(!hashMap.containsKey(clothes[i][1])){
                hashMap.put(clothes[i][1],1);
            }else{
                hashMap.put(clothes[i][1], hashMap.get(clothes[i][1])+1);
            }
        }
        int answer = 1;
        Iterator<Integer> it = hashMap.values().iterator();
        while (it.hasNext()){
            answer*=it.next().intValue()+1;
        }
        answer-=1;
        return answer;
    }
}