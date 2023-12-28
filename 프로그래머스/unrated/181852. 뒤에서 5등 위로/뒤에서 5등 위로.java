import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        int[] sort_list = Arrays.copyOf(num_list, num_list.length);
        
        Arrays.sort(sort_list);
        answer = Arrays.copyOfRange(sort_list, 5, sort_list.length);
        
        return answer;
    }
}