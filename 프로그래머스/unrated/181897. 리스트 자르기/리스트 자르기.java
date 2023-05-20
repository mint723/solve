import java.util.ArrayList;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        ArrayList<Integer> answerArr = new ArrayList<>();
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];

        switch (n){
            case 1:
                for (int i = 0; i <= b; i++) {
                    answerArr.add(num_list[i]);
                }
                break;
            case 2:
                for (int i = a; i <num_list.length; i++) {
                    answerArr.add(num_list[i]);
                }
                break;
            case 3:
                for (int i = a; i <= b; i++) {
                    answerArr.add(num_list[i]);
                }
                break;
            case 4:
                for (int i = a; i <=b; i+=c) {
                    answerArr.add(num_list[i]);
                }
                break;
        }

        int[] answer = new int[answerArr.size()];
        for (int i = 0; i < answerArr.size(); i++) {
            answer[i]=answerArr.get(i);
        }
        return answer;
    }
}