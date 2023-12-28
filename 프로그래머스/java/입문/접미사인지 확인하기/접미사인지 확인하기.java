class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        if(my_string.endsWith(is_suffix) == true){
            answer = 1;
        }else{
            answer = 0;
        }
        return answer;
    }
}

//다른 사람의 풀이
class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        for(int i=0;i<my_string.length();i++){
            if(is_suffix.equals(my_string.substring(i))){ //my_string(i)라 함은 i번째부터 마지막 원소까지의 문자열을 의미한다.
                answer = 1;
                break;
            }
        }
        return answer;
    }
}
