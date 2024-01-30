class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = {};
        int index = 0; //정답 배열 원소 입력을 위한 index 초기화
        int interLeng = intervals.length; //구간 배열 길이 설정
        int abLeng1 = Math.abs(intervals[0][0]-intervals[0][1]) + 1; //첫 번째 구간 길이를 절대값으로 설정
        int abLeng2 = Math.abs(intervals[1][0]-intervals[1][1]) + 1; //두 번째 구간 길이
        answer = new int[abLeng1 + abLeng2]; //첫 번째와 두 번째 구간의 길이만큼 정답 배열 설정
        for(int i = 0; i < interLeng; i++) { //구간 배열 길이만큼
            int a = intervals[i][0]; //구간 배열의 a 부분들
            int b = intervals[i][1]; //구간 배열의 b 부분들을 순환
            for(int j = a; j <= b; j++) { //a의 인덱스에 해당하는 원소부터 b에 해당하는 원소까지
                answer[index++] = arr[j]; //answer에 하나씩 할당
            }
        }
        return answer;
    }
}
