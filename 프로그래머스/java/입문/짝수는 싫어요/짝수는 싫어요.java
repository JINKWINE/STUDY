class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(n+1)/2]; //배열의 갯수가 주어진 정수의 반 개
        for (int i = 1, j = 0; i <= n; i += 2) {
            answer[j] = i;
            j++;
        }
        return answer;
    }
}



--처음 작성했던 코드--
class Solution {
    public int[] solution(int n) {
        int[] answer = new int[n]; //배열의 갯수를 제대로 고려하지 않음
        for (int i = 1, j = 0; i <= n; i += 2) {
            answer[j] = i;
            j++;
        }
        return answer;
    }
}
