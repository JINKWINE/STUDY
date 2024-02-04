import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {
        String[] split = myString.split("x", -1); //'x'를 기준으로 문자열 분할하고 길이는 myString의 길이 만큼
        Arrays.sort(split); //배열 split을 정렬한다. 

        int nonEmptyCount = 0; //빈 배열 체크를 위한 갯수 체크 정수 설정
        for(String s : split){ //split을 순환하면서
            if(!s.isEmpty()){ //배열이 비어있지 않다면
                nonEmptyCount++; //체크 증가
            }
        }

        String[] answer = new String[nonEmptyCount]; //값이 있는 배열의 수만큼 문자배열 생성
        int index = 0; //정답 배열의 원소 설정
        for (String s : split) { //배열을 순환하면서
            if (!s.isEmpty()) { //배열의 값이 있다면
                answer[index++] = s; //정답 배열에 복사
            }
        }

        return answer;
    }
}
