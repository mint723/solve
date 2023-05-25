class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int[] noArr=new int[rank.length];
        for (int i = 0; i < rank.length; i++) {
            noArr[i]=i;
        }
        for (int i = 0; i < rank.length; i++) {
            if(attendance[i]==false){
                rank[i]=101;
            }
        }
        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < rank.length; j++) {
                int tmp = 0;
                int tmpNo=0;
                if(rank[i]<rank[j]){
                    tmp=rank[i];
                    tmpNo=noArr[i];
                    rank[i]=rank[j];
                    noArr[i]=noArr[j];
                    rank[j]=tmp;
                    noArr[j]=tmpNo;
                }
            }
        }
        int answer = 10000*noArr[0]+100*noArr[1]+noArr[2];
        return answer;
    }
}