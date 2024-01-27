class Solution {
    public String solution(String myString){
        StringBuilder answer = new StringBuilder(); //문자열을 조합하기 위한 StringBuilder 초기화

        for(int i = 0; i < myString.length(); i++){ //myString의 길이만큼
            char current = myString.charAt(i); //current에 myString의 원소 하나씩 확인

            if((int) current < 108){ //현재 문자가 'l' 보다 작다면(앞선다면)
                answer.append("l"); //answer문자열에 'l'를 삽입
            }else{ //그렇지 않을 경우
                answer.append(current); //myString의 현재 문자 그대로 삽입
            }
        }

        return answer.toString(); //StringBuilder이기 때문에 문자열로 변환 
    }
}
