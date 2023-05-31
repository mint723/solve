import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            hashMap.put(i,0);
        }
        for (int i = 0; i < numbers.length; i++) {
            hashMap.put(numbers[i],hashMap.get(numbers[i])+1 );
        }
        for (int i = 0; i < 10; i++) {
            if(hashMap.get(i)==0){
                answer+=i;
            }
        }
        return answer;
    }
}