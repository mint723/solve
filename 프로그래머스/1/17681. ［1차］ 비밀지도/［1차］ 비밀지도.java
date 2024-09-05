import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String a = Integer.toString(arr1[0],2);
        
        for(int i = 0; i<n; i++){
            StringBuilder sb = new StringBuilder();
            String map1 = toBinaryString(arr1[i], n);
            String map2 = toBinaryString(arr2[i], n);
            for(int j=0; j<n; j++){
                if(map1.charAt(j) == '1' || map2.charAt(j) == '1'){
                    sb.append('#');
                }else{
                    sb.append(' ');
                }
            }
            answer[i] = sb.toString();
        }
        return answer;
    }
    
    public String toBinaryString(int n, int length){
        StringBuilder sb = new StringBuilder(Integer.toString(n, 2));
        if(sb.length()<length){
            while(sb.length()!=length){
                sb.insert(0,"0");
            }
        }
        
        return sb.toString();
    }
}