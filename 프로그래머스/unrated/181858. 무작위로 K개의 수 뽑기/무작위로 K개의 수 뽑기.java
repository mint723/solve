import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(al.size()<k && !al.contains(arr[i])){
                al.add(arr[i]);
            }
        }

        if (al.size()<k){
            while (al.size()!=k){
                al.add(-1);
            }
        }

        int[] answer = new int[k];
        for (int i = 0; i < al.size(); i++) {
            answer[i]=al.get(i);
        }
        return answer;
    }
}