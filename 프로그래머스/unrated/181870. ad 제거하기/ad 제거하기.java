import java.util.ArrayList;
class Solution {
    public String[] solution(String[] strArr) {
        String ad = "ad";
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < strArr.length; i++) {
            arr.add(strArr[i]);
            for (int j = 0; j <= strArr[i].length()-ad.length(); j++) {
                if (strArr[i].substring(j,j+ad.length()).equals(ad)){
                    arr.remove(strArr[i]);
                }
            }
        }
        String[] answer = new String[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }
        return answer;
    }
}