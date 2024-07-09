import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        List<String> list = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        Map<String, String> map = new HashMap<>();
        
        for(int i=0; i<record.length; i++){
            if(record[i].split(" ")[0].equals("Enter") || 
               record[i].split(" ")[0].equals("Change")){
                map.put(record[i].split(" ")[1],record[i].split(" ")[2]);
            }
        }
        
        //마지막으로 변경된 닉네임, 혹은 닉네임으로 answer 완성하기
        for(int i=0; i<record.length; i++){
            StringBuilder sb = new StringBuilder();
            String tmp = record[i];
            String[] sliceTmp = record[i].split(" ");
            String behavior = sliceTmp[0];
            if(behavior.equals("Enter")){
                sb.append(map.get(sliceTmp[1]));
                sb.append("님이 들어왔습니다.");
                list.add(sb.toString());
            }else if(behavior.equals("Leave")){
                sb.append(map.get(sliceTmp[1]));
                sb.append("님이 나갔습니다.");
                list.add(sb.toString());
            }
        }
        
        String[] answer = new String[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}