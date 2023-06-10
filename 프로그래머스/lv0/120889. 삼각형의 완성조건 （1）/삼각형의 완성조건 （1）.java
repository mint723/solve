import java.util.*;

class Solution {
    public int solution(int[] sides) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < sides.length; i++) {
            priorityQueue.add(sides[i]);
        }
        int max = priorityQueue.poll();
        int others = priorityQueue.poll()+ priorityQueue.poll();
        int answer = max<others?1:2;
        return answer;
    }
}