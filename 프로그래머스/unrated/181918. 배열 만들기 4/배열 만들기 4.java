import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
		int i = 0;
		ArrayList<Integer> answer = new ArrayList<>();
		while (i!=arr.length) {
			if(answer.size()==0) {
				answer.add(arr[i]);
				i++;
			}
			else if(answer.get(answer.size()-1)<arr[i]){
				answer.add(arr[i]);
				i++;
			}
			else {
				answer.remove(answer.size()-1);
			}
		}
		
		int[] stk = new int[answer.size()];
		for (int j = 0; j < answer.size(); j++) {
			stk[j]=answer.get(j);
		}
        return stk;
    }
}