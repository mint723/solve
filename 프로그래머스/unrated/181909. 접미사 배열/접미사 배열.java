import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public String[] solution(String my_string) {
        ArrayList<String> result = new ArrayList<String>();
		for (int i = 1; i < my_string.length()+1; i++) {
			result.add(my_string.substring(my_string.length()-i));
		}
		Collections.sort(result);
		String[] answer = new String[result.size()];
		for (int i = 0; i < result.size(); i++) {
			answer[i] = result.get(i);
		}
        
        return answer;
    }
}