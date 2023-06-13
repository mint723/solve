import java.util.*;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        if(direction.equals("right")){
            arrayList.add(numbers[numbers.length-1]);
            for(int i = 0; i<numbers.length-1; i++){
                arrayList.add(numbers[i]);
            }
            
            for(int i = 0; i<arrayList.size(); i++){
                answer[i]=arrayList.get(i);
            }
        } else{
            
            for(int i = 1; i<numbers.length; i++){
                 arrayList.add(numbers[i]);    
            }
            arrayList.add(numbers[0]);
            for(int i = 0; i<arrayList.size(); i++){
                answer[i]=arrayList.get(i);
            }
        }
        return answer;
    }
}