import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        String[] tmp = {"RT","CF","JM","AN"};
        HashMap<Character,Integer> hashMap = new HashMap<>();
        hashMap.put('R',0);
        hashMap.put('T',0);
        hashMap.put('C',0);
        hashMap.put('F',0);
        hashMap.put('J',0);
        hashMap.put('M',0);
        hashMap.put('A',0);
        hashMap.put('N',0);

        for (int i = 0; i < survey.length; i++) {
            int score = choices[i]-4;
            char left = survey[i].charAt(0);
            char right = survey[i].charAt(1);
            if(score<0){
                hashMap.put(left,hashMap.get(left)+(score*-1));
                hashMap.get(left);
            }
            if(score>0){
                hashMap.put(right,hashMap.get(right)+score);
                hashMap.get(right);
            }
        }

        for (int i = 0; i < tmp.length; i++) {
            char left = tmp[i].charAt(0);
            char right = tmp[i].charAt(1);
            if(hashMap.get(left)>=hashMap.get(right)){
                answer+=left;
            }else{
                answer+=right;
            }
        }
        return answer;
    }
}