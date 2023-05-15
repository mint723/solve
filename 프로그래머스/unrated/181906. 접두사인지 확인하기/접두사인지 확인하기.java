import java.util.ArrayList;
class Solution {
    public int solution(String my_string, String is_prefix) {
		ArrayList<String> result = new ArrayList<String>();
		for (int i = 1; i < my_string.length()+1; i++) {
			result.add(my_string.substring(0,i));
		}
		int answer = 0;
		for (int i = 0; i < result.size(); i++) {
			if(result.get(i).equals(is_prefix)) {
				answer++;
			}
		}
        return answer;
    }
}