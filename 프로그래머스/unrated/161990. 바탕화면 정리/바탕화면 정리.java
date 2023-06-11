class Solution {
    public int[] solution(String[] wallpaper) {
        int[] dot1 = {51,51};
        int[] dot2 = {-1,-1};

        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if(wallpaper[i].charAt(j)=='#'){
                    if(dot1[0]>i){
                        dot1[0]=i;
                    }
                    if(dot1[1]>j){
                        dot1[1]=j;
                    }
                    if(dot2[0]<i+1){
                        dot2[0]=i+1;
                    }
                    if(dot2[1]<j+1){
                        dot2[1]=j+1;
                    }

                }
            }
        }
        int[] answer = {dot1[0],dot1[1],dot2[0],dot2[1]};
        return answer;
    }
}