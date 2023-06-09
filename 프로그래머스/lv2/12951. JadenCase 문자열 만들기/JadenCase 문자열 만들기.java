class Solution {
    public String solution(String s) {
        String[] sArr = s.toLowerCase().split(" ");
        String answer = "";
        for (int i = 0; i < sArr.length; i++) {
            if(sArr[i].length()==1){
                sArr[i] = sArr[i].toUpperCase();
            }
            else if(sArr[i].length()!=0){
                sArr[i] = sArr[i].substring(0,1).toUpperCase()+sArr[i].substring(1);
            }
            if(i!=sArr.length-1){
                answer+=sArr[i]+" ";    
            }
            else{
                answer+=sArr[i];
            }
            
        }
        if(s.substring(s.length()-1).equals(" ")){
            answer+=" ";
        }
        return answer;
    }
}