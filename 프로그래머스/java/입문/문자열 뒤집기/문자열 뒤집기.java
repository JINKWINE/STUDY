class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i = my_string.length()-1; i >= 0; i--){ //my_string 문자열의 끝 자리부터 첫번째 원소 자리까지 1씩 감소
            answer = answer + my_string.charAt(i); // answer 문자열에 끝자리부터 한글자씩 첨가
        }
        return answer;
    }
}
