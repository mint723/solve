import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        //queue.poll 가장 첫 값
        List<Integer> list = new ArrayList<>();
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int num : score){
            if(queue.size()<k){
                queue.add(num);
            }else{
                if(queue.peek()<=num){
                    queue.add(num);
                }
            }
            
            if(queue.size()>k){
                queue.poll();
            }
            list.add(queue.peek());            
        }
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}