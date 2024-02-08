import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries){
        int[] answer = new int[queries.length];

        for(int i = 0; i < queries.length; i++){
           int start = queries[i][0];
           int end = queries[i][1];
           int comparison = queries[i][2];

           int minInRange = Integer.MAX_VALUE; // 현재까지의 최솟값을 저장하는 변수

           for(int j = start; j <= end; j++){
                if(arr[j] > comparison && arr[j] < minInRange){
                    minInRange = arr[j];
                }
           }

            // 현재 쿼리에 대한 결과를 answer 배열에 저장
           answer[i] = (minInRange == Integer.MAX_VALUE) ? -1 : minInRange;
        }

        return answer;
    }
}
