import java.util.*;

class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        // 전체를 int로 변환 후 (분 + 초) 계산
        int video_len_int = (Integer.parseInt(video_len.substring(0,2)) * 60) + Integer.parseInt(video_len.substring(3,5));
        
        int op_start_int = (Integer.parseInt(op_start.substring(0,2)) * 60) + Integer.parseInt(op_start.substring(3,5));
        
        int op_end_int = (Integer.parseInt(op_end.substring(0,2)) * 60) + Integer.parseInt(op_end.substring(3,5));
        
        for (int i=0; i<commands.length; i++){
            int posMin = Integer.parseInt(pos.substring(0,2)); // 현재 시간
            int posSec = Integer.parseInt(pos.substring(3,5)); // 현재 분
            int pos_int = (posMin * 60) + posSec;
            
            if(pos_int <= op_end_int && pos_int>= op_start_int){
                pos_int = op_end_int;
            }
            
            if(commands[i].equals("next")){
                if(pos_int + 10 > video_len_int){
                    pos_int = video_len_int;
                }else{
                    pos_int += 10;
                }
            } else if(commands[i].equals("prev")){
                if(pos_int - 10 < 0){
                    pos_int = 0;
                }else{
                    pos_int -= 10;
                }
            }
            
            if(pos_int <= op_end_int && pos_int>= op_start_int){
                pos_int = op_end_int;
            }
            
            StringBuilder sb = new StringBuilder();
            if(pos_int/60 < 10){
                sb.append('0');
            }
            sb.append(pos_int/60);
            sb.append(":");
            if(pos_int%60 < 10){
                sb.append('0');
            }
            sb.append(pos_int%60);
            pos = sb.toString();
        }
        return pos;
    }
}