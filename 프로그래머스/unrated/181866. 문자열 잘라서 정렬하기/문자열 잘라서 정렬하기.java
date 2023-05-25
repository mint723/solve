import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String[] solution(String myString) {
        String[] arr = myString.split("x");
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            result.add(arr[i]);
        }
        Collections.sort(result);
        String[] answer = new String[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}