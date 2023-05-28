import java.util.*;

class Solution {
    public String solution(String s) {
        String[] sArr = s.split(" ");
        int[] iArr = new int[sArr.length];
        for (int i = 0; i < sArr.length; i++) {
            iArr[i] = Integer.parseInt(sArr[i]);
        }
        Arrays.sort(iArr);

        for (int i = 0; i < iArr.length; i++) {
            System.out.println(iArr[i]);
        }
        String answer = iArr[0]+" "+iArr[iArr.length-1];
        return answer;
    }
}