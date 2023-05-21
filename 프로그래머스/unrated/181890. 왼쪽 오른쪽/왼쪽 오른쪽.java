import java.util.*;
class Solution {
    public String[] solution(String[] str_list) {
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")){
                for (int j = 0; j < i; j++) {
                    result.add(str_list[j]);
                }
                break;
            }
            else if (str_list[i].equals("r")) {
                for (int j = i+1; j < str_list.length; j++) {
                    result.add(str_list[j]);
                }
                break;
            }
        }
        String[] answer = new String[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}