import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<Integer>();
        ArrayList<Integer> answerArr = new ArrayList<>();

        for (int i =0; i< progresses.length; i++){
            int num=0;
            while (progresses[i]<100){
                progresses[i]+=speeds[i];
                num++;
            }
            queue.add(num);
        }
        
        while (!queue.isEmpty()){
            int goal = queue.poll();
            int num = 1;
            while (!queue.isEmpty()&&queue.peek()<=goal){
                queue.poll();
                num++;
            }

            answerArr.add(num);

        }
        
        int[] answer = new int[answerArr.size()];
        for (int i = 0; i < answerArr.size(); i++) {
            answer[i] = answerArr.get(i);
        }
        
        return answer;
    }
}