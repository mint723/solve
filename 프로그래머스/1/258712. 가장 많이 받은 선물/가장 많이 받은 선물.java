import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        // 사람별 받은 선물 관리
        Map<String, Map<String, Integer>> recived = new HashMap<>();
        // 선물 지수
        Map<String, int[]> scores = new HashMap<>(); 
        for(int i=0; i<friends.length; i++){
            Map<String, Integer> map = new HashMap<>();
            // 선물을 주지 않은 친구도 관리하기 위해서 0으로 초기화
            for(int j=0; j<friends.length; j++){
                if(i!=j)
                    map.put(friends[j], 0);
            }
            recived.put(friends[i], map);
            scores.put(friends[i], new int[]{0,0}); // [0] 준 선물, [1] 받은 선물
        }
            
        
        
        for(String history : gifts){
            String[] arr = history.split(" ");
            // 선물 준 사람
            String give = arr[0];
            // 선물 받은 사람
            String given = arr[1];
            Map<String, Integer> map = recived.get(given);
            
            map.put(give, map.get(give) + 1);
            
            // 받은 사람 선물 지수
            scores.get(given)[1] ++;
            // 준 사람 선물 지수
            scores.get(give)[0] ++;
        }
        
        int[] arr = new int[friends.length];
        
        for(int i=0; i<friends.length; i++){
            String a = friends[i];
            int aGiftScore = getGiftScore(scores.get(friends[i]));
            
            for(int j=0; j<friends.length; j++){
                String b = friends[j];
                int bGiftScore = getGiftScore(scores.get(friends[j]));
                if(i != j){
                    int recivedA = recived.get(a).get(b);
                    int recivedB = recived.get(b).get(a);
                    if(recivedA == 0 && recivedB == 0){
                        if(aGiftScore>bGiftScore){
                            arr[i]++;
                        }else if(aGiftScore<bGiftScore){
                            arr[j]++;
                        }
                    } else {
                        if(recivedA == recivedB){
                            if(aGiftScore>bGiftScore){
                                arr[i]++;
                            }else if(aGiftScore<bGiftScore){
                                arr[j]++;
                            }
                        }else{
                            if(recivedA < recivedB){
                                arr[i]++;
                            }else{
                                arr[j]++;
                            }
                        }
                    }
                }
            }
        }
        
        int answer = 0;
        
        for(int n : arr){
            answer = Math.max(answer ,n/2);
        }
        
        return answer;
    }
    
    int getGiftScore(int[] score){
        return score[0] - score[1];
    }
}