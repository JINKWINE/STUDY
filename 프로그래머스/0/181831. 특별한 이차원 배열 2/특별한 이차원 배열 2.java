class Solution {
    public int solution(int[][] arr) {
        int answer = 1;  //행렬값이 일치한다고 가정

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                // 각 행의 길이만큼 j 순회
                if (arr[i][j] != arr[j][i]) { //행렬값이 일치하지 않는다면
                    answer = 0;
                    break;  //answer에 0입력 후 반복문 종료
                }
            }
            if (answer == 0) {
                break;  //행렬값이 일치하지 않는 것이 확인 되면 반복문 종료
            }
        }

        return answer;
    }
}
