class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        for(int i = 0; i < str1.length(); i++){
            answer += String.valueOf(str1.charAt(i)) + String.valueOf(str2.charAt(i)); 
    
        }
        return answer;
    }
}


//다른 사람의 풀이
//나눠서 답변을 출력하면 굳이 문자열로 바꿀 필요가 없음
class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        for(int i = 0; i < str1.length(); i++){
            answer += str1.charAt(i);
            answer += str2.charAt(i);
    
        }
        return answer;
    }
}
