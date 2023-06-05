import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] noArr = {-1};
        ArrayList<Integer> tmp = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            tmp.add(arr[i]);
        }
        tmp.remove(Collections.min(tmp));
        int[] answer = new int[tmp.size()];
        for (int i = 0; i < tmp.size(); i++) {
            answer[i] = tmp.get(i);
        }
        answer = (answer.length==0)?noArr:answer;
        return answer;
    }
}