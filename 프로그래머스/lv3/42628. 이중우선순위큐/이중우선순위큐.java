import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < operations.length; i++) {
            int num = Integer.parseInt(operations[i].substring(2));
            if(operations[i].charAt(0)=='I'){
                treeSet.add(num);
            } else {
                if(num==1&&treeSet.size()>0){
                    treeSet.remove(treeSet.last());
                } else if (num==-1&&treeSet.size()>0) {
                    treeSet.remove(treeSet.first());
                }
            }
        }
        int[] answer = new int[2];
        if(treeSet.size()==0){
            answer[0] = 0;
            answer[1] = 0;
        }else {
            answer[0] = treeSet.last();
            answer[1] = treeSet.first();
        }
        return answer;
    }
}