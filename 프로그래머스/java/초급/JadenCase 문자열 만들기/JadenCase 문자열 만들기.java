class Solution {
    public String solution(String s) {
        String answer = "";
        String[] words = s.split(" "); //문자열을 " "으로 잘라서 배열에 할당

        for (int i = 0; i < words.length; i++) { //잘린 문자열을 순서대로 다시 current에 할당
            String current = words[i];
            
            if(words[i].length() == 0){ //배열이 공백(길이가 0)이라면
                answer += " "; //공백으로 처리
            }else{ //배열이 공백이 아닐 경우
                answer += current.substring(0, 1).toUpperCase(); //첫번째 글자를 대문자로 처리
                answer += current.substring(1, current.length()).toLowerCase(); //첫글자 이후 글자는 소문자로 처리
                answer += " "; //띄어쓰기를 위한 공백 삽입
            }
        }
        
        if(s.substring(s.length()-1, s.length()).equals(" ")){ //주어진 문자열의 마지막이 공백이라면
            return answer; //그대로 정답 반환
        }
        
        return answer.substring(0, answer.length()-1); //정답 문자열의 마지막 공백 제거
    }
}
