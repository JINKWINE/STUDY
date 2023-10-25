class Solution {
    public int solution(int slice, int n) {
        double answer = 0; //소수 자리수로 변환
        answer = Math.ceil((double)n/(double)slice); //사람수와 피자 조각 수 반올림 및 실수 변환
        return (int)answer; //정수 변환 출력
    }
}
