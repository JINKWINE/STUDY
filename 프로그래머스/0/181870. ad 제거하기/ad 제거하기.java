import java.util.Arrays;

class Solution {
    public String[] solution(String[] strArr) {
        int cnt = 0; //answer배열의 길이를 설정하기 위한 인수
        for(int i = 0; i < strArr.length; i++){ //주어지는 배열의 길이만큼 순환
            String strArr_i = strArr[i]; //contains함수를 쓰기 위한 배열 -> 문자열 변환
            if (strArr_i.contains("ad")) { //변환한 문자열에 'ad'가 있다면
                cnt++; //인수에 저장(ad를 포함한 갯수 카운트)
            }
        }
        
        String[] answer = new String[strArr.length-cnt]; // 'ad'를 포함하고 있는 문자열을 제외한 배열의 갯수만큼 배열 초기화
        int index = 0; //주어진 배열strArr과 정답에 쓰일 배열의 길이기 다르기 때문에 새로운 인수 설정
        for(int i = 0; i < strArr.length; i++) { //주어진 배열의 길이만큼 순환
            String strArr_i = strArr[i]; //contains 함수를 쓰기 위한 배열 -> 문자열 변환
            if (!strArr_i.contains("ad")) { //'ad'가 없을 경우에만
                answer[index] = strArr_i; //정답 배열에 문자 삽입
                index++; //다음 인덱스로 넘어가고 처음부터 반복
            }
        }

        return answer;
    }
}    