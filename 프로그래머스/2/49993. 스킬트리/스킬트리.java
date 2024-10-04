import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        for(String skill_tree : skill_trees){
            Set<Character> set = new HashSet<>();
            
            for(int i=0; i<skill.length(); i++){
                set.add(skill.charAt(i));
            }
            
            StringBuilder sb = new StringBuilder();
            
            for(int i=0; i<skill_tree.length(); i++){
                if(set.contains(skill_tree.charAt(i))){
                    sb.append(skill_tree.charAt(i));
                }
            }
            skill_tree = sb.toString();
            
            int count = 0;
            
            for(int i=0; i<skill_tree.length(); i++){
                if(skill_tree.charAt(i) == skill.charAt(i)){
                    count++;
                }
            }
            
            if(count==skill_tree.length()){
                answer++;
            }
            
        }
        return answer;
    }
}