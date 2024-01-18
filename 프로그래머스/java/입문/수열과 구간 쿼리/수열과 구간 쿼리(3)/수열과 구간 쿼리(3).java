class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr.clone(); // 초기 배열을 유지하기 위해 복제하여 answer 초기화

        for (int i = 0; i < queries.length; i++) {
            int i_1 = queries[i][0];
            int i_2 = queries[i][1];

            // 배열의 index1과 index2 위치의 요소를 교환
            int temp = answer[i_1];
            answer[i_1] = answer[i_2];
            answer[i_2] = temp;
        }

        return answer;
    }
}
