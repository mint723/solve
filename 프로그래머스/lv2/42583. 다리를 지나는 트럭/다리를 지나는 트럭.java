import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int current_weight = 0;
        int time = 0;
        Queue<Integer> wait = new LinkedList<>();
        Queue<Integer> ingTime = new LinkedList<>();
        Queue<Integer> ingTruck = new LinkedList<>();
        Queue<Integer> goal = new LinkedList<>();
        for (int i = 0; i < truck_weights.length; i++) {
            wait.add(truck_weights[i]);
        }
        while (goal.size()!=truck_weights.length){
            if(ingTime.size()>0&&time - bridge_length ==ingTime.peek()){
                int goalTruck = ingTruck.poll();
                ingTime.poll();
                current_weight-=goalTruck;
                goal.add(goalTruck);
            }
            if(wait.size()>0&&wait.peek()+current_weight<=weight){
                int tmp = wait.poll();
                ingTruck.add(tmp);
                ingTime.add(time);
                current_weight+=tmp;
            }
            time++;
        }
        return time;
    }
}