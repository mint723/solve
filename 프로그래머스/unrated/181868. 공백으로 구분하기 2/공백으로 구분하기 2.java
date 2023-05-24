import java.util.ArrayList;

class Solution {
    public String[] solution(String my_string) {
        ArrayList<String> arr = new ArrayList<>();
        String[] word = my_string.replaceAll("\\s"," ").split(" ");
        for (int i = 0; i < word.length; i++) {
            if (!word[i].equals("")){
                arr.add(word[i]);
            }
        }
        String[] answer = new String[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i]=arr.get(i);
        }
        return answer;
    }
}