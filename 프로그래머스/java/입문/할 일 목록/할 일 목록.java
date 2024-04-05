import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> listAnswer = new ArrayList<>();
        
        for(int i = 0; i < todo_list.length; i++) {
            if(!finished[i]) {
                listAnswer.add(todo_list[i]);
            }
        }
        
        String[] answer = new String[listAnswer.size()];
        answer = listAnswer.toArray(answer);
        return answer;
        
    }
}
