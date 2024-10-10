import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<progresses.length; i++){
            q.add((int)Math.ceil((100-progresses[i])/(speeds[i]*1.0)));
        }
        
        while(!q.isEmpty()){
            int count = 1;
            int num = q.poll();
            
            while(!q.isEmpty() && q.peek() <= num){
                q.poll();
                count++;
            }
            list.add(count);
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}