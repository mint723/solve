import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        HashSet numberSet = new HashSet();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if(i!=j){
                    numberSet.add(numbers[i]+numbers[j]);
                }
            }
        }
        int[] answer =new int[numberSet.size()];
        Iterator it = numberSet.iterator();

        int num=0;
        while (it.hasNext()){
            answer[num] = (int)it.next();
            num++;
        }
        Arrays.sort(answer);
        return answer;
    }
}