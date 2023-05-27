import java.util.ArrayList;

class Solution {
    public String[] solution(String myStr) {
        myStr=myStr.replaceAll("a","/").replaceAll("b","/").replaceAll("c","/");
        String[] result = myStr.split("/");
        ArrayList<String> resultArr = new ArrayList<>();
        for (int i = 0; i < result.length; i++) {
            if(!result[i].equals("")){
                resultArr.add(result[i]);
            }
        }
        if(resultArr.size()==0){
            resultArr.add("EMPTY");
        }
        String[] answer = new String[resultArr.size()];
        for (int i = 0; i < resultArr.size(); i++) {
            answer[i] = resultArr.get(i);
        }
        return answer;
    }
}