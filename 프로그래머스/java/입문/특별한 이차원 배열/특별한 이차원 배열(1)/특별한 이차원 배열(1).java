class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n]; //주어진 정수만큼 행열 길이 선언

        for (int i = 0; i < answer.length; i++) { //answer의 열 길이만큼
            for (int j = 0; j < answer[i].length; j++) { //그 안에서 answer의 각 열의 원소 길이만큼 반복문
                if (i == j) { //i와 j가 같을 때
                    answer[i][j] = 1; //그 위치에 1저장
                } else {
                    answer[i][j] = 0; //아니라면 0저장
                }
            }
        }
        return answer;
    }
}


//대각선의 값만 1이라는 사실에만 집중하면 더 간단한 코드가 될 수 있었다.
class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n]; //2차원 배열 생성 : 모든 원소 값이 0으로 세팅

        for (int i = 0; i < n; i++) {
            
            answer[i][i] = 1; //모든 대각선 요소를 1로 수정
        }

        return answer;
    }
}
