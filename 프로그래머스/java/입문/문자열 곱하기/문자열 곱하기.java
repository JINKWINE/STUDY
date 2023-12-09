//반복문 사용
class Solution {
    public String solution(String my_string, int k) {
        String answer = "";
        for(int i = 0; i < k; i++){
            answer += my_string;
        }
        return answer;
    }
}



//repeat 함수 사용
class Solution {
    public String solution(String my_string, int k) {
        String answer = "";
        answer = my_string.repeat(k);
    
        return answer;
    }
}
