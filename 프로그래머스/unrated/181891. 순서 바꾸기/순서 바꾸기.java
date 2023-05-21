import java.util.ArrayList;
class Solution {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = n; i < num_list.length; i++) {
            result.add(num_list[i]);
        }
        for (int i = 0; i < n; i++) {
            result.add(num_list[i]);
        }
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}