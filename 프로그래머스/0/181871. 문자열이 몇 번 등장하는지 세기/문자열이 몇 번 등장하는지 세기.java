class Solution {
    public int solution(String myString, String pat) {
        int answer = 0; //개수 세기 초기화
        int patLeng = pat.length(); //부분 문자열 길이 설정
        int strLeng = myString.length(); //비교 문자열 길이 설정
        
        for (int i = 0; i <= strLeng - patLeng; i++) { //부분 문자열의 길이만큼 대상 문자열의 끝까지 비교할 수 없으니까 부분 문자열의 길이만큼 빼준다. 
            boolean match = true; //일치 확인용
            for (int j = 0; j < patLeng; j++) { //부분 문자열 길이만큼 반복
                if (myString.charAt(i + j) != pat.charAt(j)) { //부분 문자열과 비교 문자열이 달라지는 시점
                    match = false; //거짓으로 판별 후
                    break; //반복문 종료
                }
            }
            if (match) { //부분 문자열이 일치하면
                answer++; //카운트 추가
            }
        }
        
        return answer;
    }
}