import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        List<Integer> list = new ArrayList<>();
        
        int saleBox = score.length / m; // 팔 수 있는 박스의 수
        if(saleBox == 0) return 0;
        
        for(int i : score){
            list.add(i);
        }
        
        list.sort(Collections.reverseOrder());
        int lowScore = list.get(score.length - (score.length % m) - 1 );
        
        for(int i=1; i<=saleBox; i++){
            answer += list.get(i*m - 1 ) * m;
        }
        
        return answer;
    }
}