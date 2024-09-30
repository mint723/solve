class Solution {
    int answer = Integer.MAX_VALUE;
    String tarStr;
    
    public int solution(String begin, String target, String[] words) {
        tarStr = target;
        
        for(int i=0; i<words.length; i++){
            if(isDiff(begin, words[i])){
                dfs(i, new boolean[words.length], words, 1);
            }
        }
        
        if(answer == Integer.MAX_VALUE){
            answer = 0;
        }
        
        return answer;
    }
    
    void dfs(int idx, boolean[] visited, String[] words, int count){
        visited[idx] = true;
        if(words[idx].equals(tarStr)){
            answer = Math.min(answer, count);
        }
        
        for(int i=0; i<words.length; i++){
            // 방문하지 않은 곳인지 확인
            if(i != idx && isDiff(words[idx], words[i]) && !visited[i]){
                dfs(i, visited, words, count+1);
            }
        }
    }
    
    boolean isDiff(String curStr, String diffStr){
        int diff = 0;
        for(int i=0; i<curStr.length(); i++){
            if(curStr.charAt(i) != diffStr.charAt(i)){
                diff++;
            }
        }
        
        if(diff != 1) return false;
        return true;
    }
}