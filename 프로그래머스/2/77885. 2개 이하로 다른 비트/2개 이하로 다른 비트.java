import java.util.*;
class Solution {
    public List<Long> solution(long[] numbers) {
        List<Long> list = new ArrayList<>();
        for(long number : numbers){
            StringBuilder sb = new StringBuilder(Long.toBinaryString(number));
            if(number%2 == 0){
                for(int i=sb.length()-1; i>=0; i--){
                    if(sb.charAt(i) == '0'){
                        sb.setCharAt(i, '1');
                        break;
                    }
                }
            }else{
                sb.insert(0, "0");
                for(int i=sb.length()-1; i>=0; i--){
                    if(sb.charAt(i) == '0'){
                        sb.setCharAt(i, '1');
                        sb.setCharAt(i+1, '0');
                        break;
                    }
                }
            }
            list.add(Long.parseLong(sb.toString(),2));
        }
        return list;
    }
}