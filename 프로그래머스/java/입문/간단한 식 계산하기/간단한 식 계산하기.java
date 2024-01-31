class Solution {
    public int solution(String binomial) {
        int answer = 0; //정답 초기화
        String[] spNum = binomial.split(" "); //공백으로 주어진 문자열 분할
        
        if(spNum[1].equals("+")){ //나눈 배열의 두 번째 문자열이 "+"일때
            answer = Integer.parseInt(spNum[0]) + Integer.parseInt(spNum[2]); //첫 번째 문자열과 세 번째 문자열을 정수로 변환 후 덧셈
        }else if(spNum[1].equals("-")){ //배열의 두 번째 문자열(연산자)이 "-"일때
            answer = Integer.parseInt(spNum[0]) - Integer.parseInt(spNum[2]); //첫 번째 문자열과 세 번째 문자열을 정수로 변환 후 뺄셈
        }else if(spNum[1].equals("*")){ //연산자가 "*" 일 때
            answer = Integer.parseInt(spNum[0]) * Integer.parseInt(spNum[2]); //첫 번째 문자열과 세 번째 문자열을 정수로 변환 후 곱셈
        }
        
        return answer;
    }
}
