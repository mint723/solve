import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
         ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> answerArr = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==2){
                result.add(i);
            }
        }
        if (result.size()==0){
            answerArr.add(-1);
        }
        else{
            for (int i = result.get(0); i <= result.get(result.size() - 1); i++) {
                answerArr.add(arr[i]);
            }
        }
        int[] answer = new int[answerArr.size()];
        for (int i = 0; i < answerArr.size(); i++) {
            answer[i]=answerArr.get(i);
        }
        
        return answer;
    }
}