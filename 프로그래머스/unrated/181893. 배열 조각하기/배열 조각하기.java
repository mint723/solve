import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            result.add(arr[i]);
        }
        for (int i = 0; i < query.length; i++) {
            if (i%2==0){
                result = result.subList(0, query[i]+1);
            }
            else{
                result = result.subList(query[i], result.size());
            }
        }

        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}