class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = {};
        int index = 0;
        int interLeng = intervals.length;
        int abLeng1 = Math.abs(intervals[0][0]-intervals[0][1]) + 1;
        int abLeng2 = Math.abs(intervals[1][0]-intervals[1][1]) + 1;
        answer = new int[abLeng1 + abLeng2];
        for(int i = 0; i < interLeng; i++) {
            int a = intervals[i][0];
            int b = intervals[i][1];
            for(int j = a; j <= b; j++) {
                answer[index++] = arr[j];
            }
        }
        return answer;
    }
}
