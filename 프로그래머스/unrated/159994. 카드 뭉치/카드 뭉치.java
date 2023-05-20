import java.util.ArrayList;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        char[] goalToEng = new char[goal.length];
        ArrayList<Character> small = new ArrayList<Character>();
        ArrayList<Character> large = new ArrayList<Character>();
        for (int i = 0; i < goal.length; i++) {
            for (int j = 0; j < cards1.length; j++) {
                if(cards1[j].equals(goal[i])){
                    goalToEng[i]=(char)('a'+j);
                }
            }
            for (int j = 0; j < cards2.length; j++) {
                if(cards2[j].equals(goal[i])){
                    goalToEng[i]=(char)('A'+j);
                }
            }
        }
        for (int i = 0; i < goalToEng.length; i++) {
            if('a'<=goalToEng[i]&&goalToEng[i]<='z'){
                small.add(goalToEng[i]);
            }
            else{
                large.add(goalToEng[i]);
            }
        }
        boolean largeAnswer=true;
        boolean smallAnswer=true;
        if(large.get(0)!='A'){
            largeAnswer=false;
        }
        else{
            for (int i = 1; i < large.size(); i++) {
                if(large.get(i-1)!=large.get(i)-1){
                    largeAnswer=false;
                }
            }
        }
        if(small.get(0)!='a'){
            smallAnswer=false;
        }
        else{
            for (int i = 1; i < small.size(); i++) {
                if(small.get(i-1)!=small.get(i)-1){
                    smallAnswer=false;
                }
            }
        }
        String answer = (largeAnswer==true&&smallAnswer==true)?"Yes":"No";
        
        return answer;
        
    }
}