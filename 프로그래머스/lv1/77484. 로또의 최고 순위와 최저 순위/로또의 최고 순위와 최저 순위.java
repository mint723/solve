class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zero = 0;
        int same = 0;
        for (int i = 0; i < lottos.length; i++) {
            if(lottos[i]==0){
                zero++;
            }
            for (int j = 0; j < lottos.length; j++) {
                if(lottos[i]==win_nums[j]){
                    same++;
                }
            }
        }
        int[] answer = {ranking(same+zero),ranking(same)};
        return answer;
    }
    static int ranking(int num){
        if(0<=num&&num<=6){
            switch (num){
                case 6:
                    return 1;
                case 5:
                    return 2;
                case 4:
                    return 3;
                case 3:
                    return 4;
                case 2:
                    return 5;
                case 1:
                    return 6;
                case 0:
                    return 6;
            }
        }
            return 6;

    }
}