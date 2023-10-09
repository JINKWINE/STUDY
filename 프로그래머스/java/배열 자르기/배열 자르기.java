import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        if (num1 < 0 || num2 >= numbers.length || num1 > num2) {
            
            return new int[0];
        }

        int[] answer = new int[num2 - num1 + 1];
        System.arraycopy(numbers, num1, answer, 0, num2 - num1 + 1);
        return answer;
    }
}
