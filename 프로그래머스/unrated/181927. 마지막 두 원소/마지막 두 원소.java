import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int numLeng = num_list.length;
        int lastNum = num_list[numLeng - 1];
        int lastForeNum = num_list[numLeng - 2];

        int[] answer;

        if (lastNum > lastForeNum) {

            answer = Arrays.copyOf(num_list, numLeng + 1);
            answer[numLeng] = lastNum - lastForeNum;
        } else {
 
            answer = Arrays.copyOf(num_list, numLeng + 1);
            answer[numLeng] = lastNum * 2;
        }

        return answer;
    }
}
