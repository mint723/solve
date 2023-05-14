import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStr, int k, int s, int l) {
        ArrayList<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < intStr.length; i++) {
			int num = Integer.parseInt(intStr[i].substring(s,l+s));
			if (num>k) {
				result.add(num);
			}
		}
		int[] answer = new int[result.size()];
		for (int i = 0; i < result.size(); i++) {
			answer[i] = result.get(i);
		}
        return answer;
    }
}