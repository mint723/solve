import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%divisor==0){
                priorityQueue.add(arr[i]);
            }
        }
        int[] answer = new int[priorityQueue.size()];
        if(priorityQueue.size()==0){
            return new int[]{-1};
        }
        for (int i = 0; i < answer.length; i++) {
            answer[i]= priorityQueue.poll();
        }
        return answer;
    }
}