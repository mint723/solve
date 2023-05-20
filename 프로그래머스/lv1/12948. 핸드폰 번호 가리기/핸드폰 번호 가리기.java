class Solution {
    public String solution(String phone_number) {
        int number = phone_number.length()-4;
        String first_number = phone_number.substring(0,number);
        String last_number=phone_number.substring(number);
        String answer = "";
        for (int i = 0; i < first_number.length(); i++) {
            answer+="*";
        }
        answer+=last_number;
        return answer;
    }
}