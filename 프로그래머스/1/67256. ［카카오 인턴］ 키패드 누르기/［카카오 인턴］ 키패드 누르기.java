import java.util.*;

class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        Map<Integer, int[]> map = new HashMap<>();
        map.put(1, new int[]{0,0});
        map.put(4, new int[]{1,0});
        map.put(7, new int[]{2,0});
        map.put(2, new int[]{0,1});
        map.put(5, new int[]{1,1});
        map.put(8, new int[]{2,1});
        map.put(0, new int[]{3,1});
        map.put(3, new int[]{0,2});
        map.put(6, new int[]{1,2});
        map.put(9, new int[]{2,2});
        map.put(-1, new int[]{3,0});
        map.put(-2, new int[]{3,2});
        
        int leftHand = -1;
        int rightHand = -2;
        
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7){
                sb.append("L");
                leftHand = numbers[i];
            }else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9){
                sb.append("R");
                rightHand = numbers[i];
            }else{
                int[] target = map.get(numbers[i]);
                int leftDistance = getDistance(map.get(leftHand), target);
                
                int rightDistance = getDistance(map.get(rightHand), target);
                
                if(leftDistance == rightDistance){
                    if(hand.equals("right")){
                        sb.append("R");
                        rightHand = numbers[i];
                    }else{
                        sb.append("L");
                        leftHand = numbers[i];
                    }
                }else{
                    if(leftDistance>rightDistance){
                        sb.append("R");
                        rightHand = numbers[i];
                    }else{
                        sb.append("L");
                        leftHand = numbers[i];
                    }
                }
            }
        }
        
        return sb.toString();
    }
    
    private int getDistance(int[] from, int[] to) {
        return Math.abs(from[0] - to[0]) + Math.abs(from[1] - to[1]);
    }
}