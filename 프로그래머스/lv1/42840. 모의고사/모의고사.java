import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] no1 = {1,2,3,4,5};
        int[] no2 = {2,1,2,3,2,4,2,5};
        int[] no3 = {3,3,1,1,2,2,4,4,5,5};
        int no1Index = 0;
        int no2Index = 0;
        int no3Index = 0;


        Integer[] result = {0,0,0};
        for (int i = 0; i < answers.length; i++) {
            if(no1Index==no1.length){
                no1Index=0;
            }
            if(no2Index==no2.length){
                no2Index=0;
            }
            if(no3Index==no3.length){
                no3Index=0;
            }
            if(answers[i]==no1[no1Index]){
                result[0]++;
            }
            if(answers[i]==no2[no2Index]){
                result[1]++;
            }
            if(answers[i]==no3[no3Index]){
                result[2]++;
            }

            no1Index++;
            no2Index++;
            no3Index++;
        }
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(result));
        ArrayList<Integer> tmp = new ArrayList<>();
        int max = Collections.max(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i)==max){
                tmp.add(i+1);
            }
        }
        int[] answer = new int[tmp.size()] ;
        for (int i = 0; i < tmp.size(); i++) {
            answer[i]= tmp.get(i);    
        }
        return answer;
    }
}