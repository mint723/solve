import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        n=n-lost.length;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        for (int i = 0; i < reserve.length; i++) {
            for (int j = 0; j < lost.length; j++) {
                if(reserve[i]==lost[j]){
                    reserve[i]=100;
                    lost[j]=100;
                }
            }
        }
        for (int i = 0; i < reserve.length; i++) {
            for (int j = 0; j < lost.length; j++) {
                if(lost[j]==reserve[i]-1||lost[j]==reserve[i]||lost[j]==reserve[i]+1){
                    n++;
                    lost[j]=31;
                    reserve[i]=35;
                }
            }
        }
        return n;
    }
}