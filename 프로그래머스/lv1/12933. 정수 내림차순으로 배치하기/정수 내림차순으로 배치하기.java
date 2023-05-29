import java.util.*;

class Solution {
    public long solution(long n) {
        String tmp = ""+n;
        ArrayList<Character> arrayList = new ArrayList<>();
        for (int i = 0; i < tmp.length(); i++) {
            arrayList.add(tmp.charAt(i));
        }
        int num = arrayList.size();
        tmp = "";
        for (int i = 0; i < num; i++) {
            tmp+= Collections.max(arrayList);
            arrayList.remove(Collections.max(arrayList));
        }


        long answer = Long.parseLong(tmp);
        return answer;
    }
}