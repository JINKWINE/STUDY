import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for (int q = 0; q < queries.length; q++) {
            int start = queries[q][0];
            int end = queries[q][1];
            int comparison = queries[q][2];

            int minInRange = Integer.MAX_VALUE; // 현재까지의 최솟값을 저장하는 변수

            for (int i = start; i <= end; i++) {
                if (arr[i] > comparison && arr[i] < minInRange) {
                    minInRange = arr[i];
                }
            }

            // 현재 쿼리에 대한 결과를 answer 배열에 저장
            answer[q] = (minInRange == Integer.MAX_VALUE) ? -1 : minInRange;
        }

        return answer;
    }
}
