import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        cities = Arrays.stream(cities).map(String::toLowerCase).toArray(String[]::new);
        if(cacheSize == 0) return 5 * cities.length;
        
        int answer = 5; // 처음에 들어가는 값은 무조건 cache miss
        
        Queue<String> q = new LinkedList<>();
        
        q.add(cities[0]);
        for(int i = 1; i<cities.length; i++){
            if(q.contains(cities[i])){ //cache hit
                q.remove(cities[i]);
                q.add(cities[i]);
                answer++;
            }else{ //cache miss
                if(q.size() == cacheSize){ // queue 사이즈가 다 찬 경우
                    q.poll();
                    q.add(cities[i]);
                }else{ // queue 사이즈가 다 차지 않은 경우
                    q.add(cities[i]);
                }
                answer+=5;
            }
        }
        return answer;
    }
}