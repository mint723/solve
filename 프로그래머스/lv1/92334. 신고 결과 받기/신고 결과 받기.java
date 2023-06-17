import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        HashSet<String> distinct = new HashSet<>();
        for (int i = 0; i < report.length; i++) {
            distinct.add(report[i]);
        }

        Iterator<String> distinctReport = distinct.iterator();
        HashMap<String, Integer> reported = new HashMap<>();
        HashMap<String, HashSet<String>> reporter = new HashMap<>();
        while (distinctReport.hasNext()){
            String report_list = distinctReport.next();
            String reported_id = report_list.substring(report_list.indexOf(" ")+1);
            String reporter_id = report_list.substring(0,report_list.indexOf(" "));
            if(!reported.containsKey(reported_id)){
                reported.put(reported_id,1);
            }else{
                reported.put(reported_id,reported.get(reported_id)+1);
            }
            if(!reporter.containsKey(reporter_id)){
                reporter.put(reporter_id,new HashSet<>());
                reporter.get(reporter_id).add(reported_id);
            }else{
                reporter.get(reporter_id).add(reported_id);
            }
        }
        int[] answer = new int[id_list.length];
        Arrays.fill(answer,0);
        for (int i = 0; i < id_list.length; i++) {
            if(reporter.containsKey(id_list[i])){
                Iterator<String> check = reporter.get(id_list[i]).iterator();
                while(check.hasNext()){
                    String next = check.next();
                    if(reported.get(next)>=k){
                        answer[i]+=1;
                    }
                }
            }

        }
        return answer;
    }
}