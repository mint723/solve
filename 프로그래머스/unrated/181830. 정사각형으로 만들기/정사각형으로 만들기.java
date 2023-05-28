class Solution {
    public int[][] solution(int[][] arr) {
        int arrCol = arr[0].length;
        int arrRow = arr.length;
        int square = (arrCol>arrRow)?arrCol:arrRow;

        int[][] answer = new int[square][square];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                answer[i][j] = arr[i][j];
            }
        }
        return answer;
    }
}