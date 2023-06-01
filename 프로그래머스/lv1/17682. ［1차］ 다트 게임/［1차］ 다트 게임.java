import java.util.*;

class Solution {
    public int solution(String dartResult) {
        ArrayList<String> tmp = new ArrayList<>();
        while (dartResult.length()!=0){
            if(dartResult.length()>1&&dartResult.substring(0,2).equals("10")){
                tmp.add(dartResult.substring(0,3));
                dartResult = dartResult.substring(3);
            }
            else if(dartResult.length()>1&&!(dartResult.substring(0,2).contains("*")||dartResult.substring(0,2).contains("#"))){
                tmp.add(dartResult.substring(0,2));
                dartResult = dartResult.substring(2);
            }else {
                tmp.add(dartResult.substring(0,1));
                dartResult = dartResult.substring(1);
            }
        }


        Stack<Integer> result = new Stack<>();
        while (tmp.size()!=0){
            if(result.size()==1&&tmp.get(0).equals("*")){
                result.push(result.pop()*2);
                tmp.remove(0);
            }else if(tmp.get(0).equals("*")){
                int num1 = result.pop()*2;
                int num2 = result.pop()*2;
                result.push(num2);
                result.push(num1);
                tmp.remove(0);
            } else if (tmp.get(0).equals("#")) {
                result.push(result.pop()*-1);
                tmp.remove(0);
            } else if (tmp.get(0).length()==3) {
                int num = Integer.parseInt(tmp.get(0).substring(0,2));
                int bonus = 0;
                if(tmp.get(0).charAt(2)=='S'){
                    bonus = 1;
                }else if(tmp.get(0).charAt(2)=='D'){
                    bonus = 2;
                }else if(tmp.get(0).charAt(2)=='T'){
                    bonus = 3;
                }
                result.push((int)Math.pow(num,bonus));
                tmp.remove(0);
            } else{
                int num = tmp.get(0).charAt(0)-'0';
                int bonus = 0;
                if(tmp.get(0).charAt(1)=='S'){
                    bonus = 1;
                }else if(tmp.get(0).charAt(1)=='D'){
                    bonus = 2;
                }else if(tmp.get(0).charAt(1)=='T'){
                    bonus = 3;
                }
                result.push((int)Math.pow(num,bonus));
                tmp.remove(0);
            }
        }
        int answer = 0;
        for (int i = 0; i < result.size() ; i++) {
            answer+=result.get(i);
        }
        return answer;
    }
}