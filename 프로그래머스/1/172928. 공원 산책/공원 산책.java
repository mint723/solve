import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] curPos = new int[2];
        
        int[] dx = {0, 0, -1, 1}; // 동(E), 서(W), 북(N), 남(S)
        int[] dy = {1, -1, 0, 0}; // 동(E), 서(W), 북(N), 남(S)
        
        Map<Character, Integer> map = new HashMap<>();
        map.put('E', 0);
        map.put('W', 1);
        map.put('N', 2);
        map.put('S', 3);
        
        // 시작점
        for(int i=0; i<park.length; i++){
            for(int j=0; j<park[i].length(); j++){
                if(park[i].charAt(j) == 'S'){
                    curPos[0] = i;
                    curPos[1] = j;
                }
            }
        }
        
        for(int i=0; i<routes.length; i++){
            char[] arr = routes[i].toCharArray();
            int cor = map.get(arr[0]);
            boolean flag = true;
            for(int j=0; j<arr[2]-'0'; j++){
                int xPos = curPos[0] + (dx[cor] * (j+1));
                int yPos = curPos[1] + (dy[cor] * (j+1));
                if (0 > xPos || park.length <= xPos || 0 > yPos || park[0].length() <= yPos || park[xPos].charAt(yPos) == 'X')
                    flag = false;
            }
            
            if(flag){
                curPos[0] = curPos[0] + (dx[cor] * (arr[2]-'0'));
                curPos[1] = curPos[1] + (dy[cor] * (arr[2]-'0'));
            }
            
        }
        
        return curPos;
    }
}