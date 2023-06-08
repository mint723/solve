import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        Arrays.sort(strings);
        PriorityQueue<Character> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < strings.length; i++) {
            priorityQueue.add(strings[i].charAt(n));
        }

        for (int i = 0; i < strings.length; i++) {
            char tmp = priorityQueue.poll();
            String add = "";
            for (int j = 0; j < strings.length; j++) {
                if(strings[j].charAt(n)==tmp){
                    add=strings[j];
                    strings[j]="000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000";
                    break;
                }
            }
            answer[i]=add;
        }
        return answer;
    }
}