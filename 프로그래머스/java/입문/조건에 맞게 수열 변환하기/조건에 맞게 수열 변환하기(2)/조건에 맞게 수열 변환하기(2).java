import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] temp = new int[arr.length];
        while (true) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0 && arr[i] >= 50) {
                    temp[i] = arr[i] / 2;
                } else if (arr[i] % 2 != 0 && arr[i] < 50) {
                    temp[i] = (arr[i] * 2) + 1;
                } else {
                    temp[i] = arr[i];
                }
            }
            answer++;
            if (Arrays.equals(arr, temp)) break;
            arr = Arrays.copyOf(temp, temp.length);
        }

        return answer-1;
    }
}
