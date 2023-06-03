import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < scoville.length; i++) {
            priorityQueue.add(scoville[i]);
        }
        int answer = 0;
        while(priorityQueue.peek()<K && priorityQueue.size()>1){
            int min1 = priorityQueue.poll();
            int min2 = priorityQueue.poll();
            priorityQueue.add(min1+(min2*2));
            answer++;
        }
        answer = (priorityQueue.peek()>=K)?answer:-1;
        return answer;
    }
}