import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<tangerine.length; i++){
            if(!map.containsKey(tangerine[i])){
                map.put(tangerine[i],1);
            }else{
                map.put(tangerine[i],map.get(tangerine[i])+1);
            }
        }
        int count = 0;
        List<Integer> list = new ArrayList<>();
        for(Integer value : map.values()){
            list.add(value);
        }
        list.sort(Collections.reverseOrder());
        for(Integer value : list){
            if(k<=value){
                count++;
                return count;
            }else{
                k-=value;
                count++;
            }
        }
        return count;
    }
}