class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        for(int i = c-1; i < my_string.length(); i += m){ //시작 인덱스를 정수 c-1로 설정하고 m씩 증가
            answer += my_string.charAt(i); //my_string을 m씩 증가시킨 문자를 정답 문자열에 할당
        }
        return answer;
    }
}
