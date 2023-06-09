import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        Set<Float> set1 = new HashSet<>();
        Set<Float> set2 = new HashSet<>();
        Set<Float> set3 = new HashSet<>();
        set1.add((dots[0][1] - dots[1][1])/((float)dots[0][0]-dots[1][0]));
        set1.add((dots[2][1] - dots[3][1])/((float)dots[2][0]-dots[3][0]));

        set2.add((dots[0][1] - dots[2][1])/((float)dots[0][0]-dots[2][0]));
        set2.add((dots[1][1] - dots[3][1])/((float)dots[1][0]-dots[3][0]));

        set3.add((dots[0][1] - dots[3][1])/((float)dots[0][0]-dots[3][0]));
        set3.add((dots[1][1] - dots[2][1])/((float)dots[1][0]-dots[2][0]));
        if(set1.size()!=2 || set2.size()!=2 || set3.size()!=2){
            answer = 1;
        }
        return answer;
    }
}