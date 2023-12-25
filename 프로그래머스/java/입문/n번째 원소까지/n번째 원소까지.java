import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        answer = Arrays.copyOfRange(num_list, 0, n);
        return answer;
    }
}


//for문 이용한 풀이

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[n];
        for(int i = 0; i < n; i++){
            answer[i] = num_list[i];
        }
        
        return answer;
        
    }
    
}
