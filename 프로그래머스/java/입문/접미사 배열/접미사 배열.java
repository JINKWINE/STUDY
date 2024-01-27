import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        int leng = my_string.length(); //주어진 문자열의 길이 추출
        String[] answer = new String[leng]; //정답 배열에 문자열의 길이만큼 초기화
        
        for(int i = 0; i < leng; i++){ //문자열 길이만큼
            answer[i] = my_string.substring(i); //정답 배열에 첫번째 문자열부터 자른 단어(접미사) 삽입
        }
        
        Arrays.sort(answer); //배열 순서 정렬
        
        return answer;
    }
}
