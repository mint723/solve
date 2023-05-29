class Solution {
    public String solution(String new_id) {
        char[] new_idArr = new_id.toLowerCase().toCharArray();
        String id = "";
        for (int i = 0; i < new_id.length(); i++) {
            if(('a'<=new_idArr[i]&&new_idArr[i]<='z') ||
                    ('0'<=new_idArr[i]&&new_idArr[i]<='9')||
                    new_idArr[i]=='.'||new_idArr[i]=='-'||new_idArr[i]=='_'){
                    if(id.length()>0&&id.substring(id.length()-1,id.length()).equals(".")&&new_idArr[i]=='.'){

                    }
                    else {
                        id+=new_idArr[i];
                    }
            }
        }
        if(id.length()>0&&id.charAt(0)=='.'){
            id = id.substring(1);
        }
        if(id.length()>0&&id.charAt(id.length()-1)=='.'){
            id= id.substring(0,id.length()-1);
        }
        if(id.length()==0){
            id="a";
        }
        if(id.length()>=16){
            id = id.substring(0,15);
            if(id.length()>0&&id.charAt(id.length()-1)=='.'){
                id= id.substring(0,id.length()-1);
            }
        }
        if(id.length()<=2){
            char tmp = id.charAt(id.length()-1);
            while (id.length()!=3){
                id+=tmp;
            }
        }
        String answer = id;
        return answer;
    }
}