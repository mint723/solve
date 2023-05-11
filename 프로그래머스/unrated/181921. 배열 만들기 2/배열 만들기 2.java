import java.util.ArrayList;
class Solution {
    public int[] solution(int l, int r) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = l; i <= r; i++) {
			int num = 0;
			String str = Integer.toString(i);
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j)=='5' || str.charAt(j)=='0') {
					num++;
				} 
				if (num == str.length()) {
					list.add(i);
				}
			}
		}
		int[] answer = new int[list.size()!=0?list.size():1];
		if (list.size()==0) {
			answer[0]=-1;
		}
		else {
			for (int i = 0; i < answer.length; i++) {
				answer[i]=list.get(i);
			}
		}  
        return answer;
    }  
}