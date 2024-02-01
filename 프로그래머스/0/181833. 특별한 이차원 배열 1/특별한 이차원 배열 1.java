class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n]; //2차원 배열 생성 : 모든 원소 값이 0으로 세팅

        for (int i = 0; i < n; i++) {
            
            answer[i][i] = 1; //모든 대각선 요소를 1로 수정
        }

        return answer;
    }
}