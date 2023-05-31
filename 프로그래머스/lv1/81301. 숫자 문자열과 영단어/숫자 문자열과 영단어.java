import java.util.*;

class Solution {
    public int solution(String s) {
        HashMap<String, Character> hashMap = new HashMap<>();
        hashMap.put("zero",'0');
        hashMap.put("one",'1');
        hashMap.put("two",'2');
        hashMap.put("three",'3');
        hashMap.put("four",'4');
        hashMap.put("five",'5');
        hashMap.put("six",'6');
        hashMap.put("seven",'7');
        hashMap.put("eight",'8');
        hashMap.put("nine",'9');
        String tmp = "";
        while (s.length()!=0){
            if('0'<=s.charAt(0)&&s.charAt(0)<='9'){
                tmp+=s.charAt(0);
                s=s.substring(1);
            } else if (s.length()>=3 && hashMap.get(s.substring(0,3))!=null) {
                tmp+=hashMap.get(s.substring(0,3));
                s=s.substring(3);
            } else if (s.length()>=4 && hashMap.get(s.substring(0,4))!=null) {
                tmp+=hashMap.get(s.substring(0,4));
                s=s.substring(4);
            } else if (s.length()>=5 && hashMap.get(s.substring(0,5))!=null) {
                tmp+=hashMap.get(s.substring(0,5));
                s=s.substring(5);
            }
        }
        int answer = Integer.parseInt(tmp);
        return answer;
    }
}