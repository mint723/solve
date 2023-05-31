import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int todayYear = Integer.parseInt(today.substring(0,4));
        int todayMonth = Integer.parseInt(today.substring(5,7));
        int todayDay = Integer.parseInt(today.substring(8,10));


        int[] years = new int[privacies.length];
        int[] months = new int[privacies.length];
        int[] days = new int[privacies.length];
        char[] types = new char[privacies.length];

        //각 배열에 날짜와 타입 추출하여 할당
        for (int i = 0; i < privacies.length; i++) {
            int year = Integer.parseInt(privacies[i].substring(0,4));
            int month = Integer.parseInt(privacies[i].substring(5,7));
            int day = Integer.parseInt(privacies[i].substring(8,10));
            char type = privacies[i].charAt(privacies[i].length()-1);
            years[i] = year;
            months[i] = month;
            days[i] = day;
            types[i] = type;
        }


        //해시맵에 타입과 타입 별 기간 할당
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < terms.length; i++) {
            hashMap.put(terms[i].charAt(0),Integer.parseInt(terms[i].substring(2)));
        }
        //해시맵을 통해 타입 별 기간을 달에 더함
        for (int i = 0; i < types.length; i++) {
            months[i]+=hashMap.get(types[i]);

            while(months[i]>12){
                years[i]+=1;
                months[i]-=12;
            }
        }
        //현재 날짜와 비교
        //비교 후 현재 날짜가 더 크면 result 에 인덱스 저장
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < privacies.length; i++) {
            if(todayYear>years[i]){
                result.add(i+1);
            }else if(todayYear==years[i]&&todayMonth>months[i]){
                result.add(i+1);
            }else if(todayYear==years[i]&&todayMonth==months[i]&&todayDay>days[i]){
                result.add(i+1);
            }else if(todayYear==years[i]&&todayMonth==months[i]&&todayDay==days[i]){
                result.add(i+1);
            }
        }



        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i]= result.get(i);
        }
        return answer;
    }
}