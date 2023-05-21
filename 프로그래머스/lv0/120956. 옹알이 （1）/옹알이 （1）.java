class Solution {
    public int solution(String[] babbling) {
        String[] canTell = {"aya","ye","woo","ma"};
        String[] result = new String[babbling.length];
        int answer = 0;
        for (int i = 0; i < babbling.length; i++) {
            if(can(babbling[i]).length()==0){
                answer++;
            }
        }
        return answer;
    }
    
     public static String can(String babbling){
        if(babbling.length()>=3&&(babbling.substring(0,3).equals("aya")||babbling.substring(0,3).equals("woo"))){
            babbling=babbling.substring(3);
            return can(babbling);
        }

        else if (babbling.length()>=2&&(babbling.substring(0,2).equals("ye")||babbling.substring(0,2).equals("ma"))) {
            babbling=babbling.substring(2);
            return can(babbling);
        }
        else{
            return babbling;
        }
    }
}