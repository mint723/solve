import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < works.length; i++) {
            priorityQueue.add(works[i]);
        }

        for (int i = 0; i < n; i++) {
            priorityQueue.add(priorityQueue.poll()-1);
        }
        Iterator<Integer> it = priorityQueue.iterator();
        while (it.hasNext()){
            int num = it.next();
            if(num>=0){
                answer+=(num*num);
            }
        }
        return answer;
    }
}