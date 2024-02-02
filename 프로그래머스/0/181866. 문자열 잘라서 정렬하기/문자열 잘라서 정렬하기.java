import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {
        // 'x'를 기준으로 문자열을 분할하고, 빈 문자열을 제외한 후 정렬
        String[] split = myString.split("x", -1); //'x'를 기준으로 문자열 분할하고 길이는 myString의 길이 만큼
        Arrays.sort(split); //배열 split을  

        // 빈 문자열을 제외한 배열 생성
        int nonEmptyCount = 0;
        for (String s : split) {
            if (!s.isEmpty()) {
                nonEmptyCount++;
            }
        }

        // 빈 문자열을 제외한 배열에 값 복사
        String[] answer = new String[nonEmptyCount];
        int index = 0;
        for (String s : split) {
            if (!s.isEmpty()) {
                answer[index++] = s;
            }
        }

        return answer;
    }
}