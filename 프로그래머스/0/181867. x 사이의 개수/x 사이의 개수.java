class Solution {
    public int[] solution(String myString) {
        String[] split = myString.split("x", -1); //myString을 x문자를 기준으로 자르되 마지막 문자열까지도 전부 담는다.
        int[] answer = new int[split.length]; //answer배열의 길이를 split배열의 길이와 동기화
        int cnt = 0; //배열의 요소의 글자수를 담을 정수
        
        for(int i = 0; i < split.length; i++){ //split의 길이만큼
            cnt = split[i].length(); //split 각 요소의 길이를 cnt에 담고
            answer[i] = cnt; //담긴 cnt를 정답 배열의 첫번째부터 할당 그리고 반복
            
        }
        
        return answer;
        
    }
}