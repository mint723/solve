import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<discount.length - 9; i++){
            for(int j=i; j<i+10; j++){
                if(!map.containsKey(discount[j])){
                    map.put(discount[j], 1);
                }else{
                    map.put(discount[j], map.get(discount[j])+1);
                }
            }
            
            int check = 0;
            
            for(int j=0; j<want.length; j++){
                if(map.get(want[j]) != null){
                    if(number[j] == map.get(want[j])){
                        check++;
                    }
                }
            }
            if(check == want.length) answer++;
            
            map.clear();
        }
        return answer;
    }
}