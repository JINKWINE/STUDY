class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        for(int i = 0; i < array.length; i++){ //배열의 길이만큼 순회
            if(array[i] == n){ // 매개변수와 일치하는 원소 검색
                answer++; //정답 반환
            }
        }
        return answer;
    }
}
