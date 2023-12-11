class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        answer = my_string.substring(0, s) + overwrite_string + my_string.substring(s+overwrite_string.length());
        return answer;
    }
}


//다른 사람의 더 깔끔한 풀이
class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String prefix = my_string.substring(0, s); 
        String suffix = my_string.substring(s + overwrite_string.length());
        return prefix + overwirte_string + suffix; //바꿔쓸 문자열을 기준으로 앞+교체+뒤로 나누어 깔끔하게 정리함
    }
}
