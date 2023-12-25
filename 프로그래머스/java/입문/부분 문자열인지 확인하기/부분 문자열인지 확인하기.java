class Solution {
    public int solution(String my_string, String target) {
        int answer = 0;
        if(my_string.contains(target) == true){
            answer = 1;
        }else{
            answer = 0;
        }
        return answer;
    }
}


//다른 사람의 풀이
class Solution {
    public int solution(String my_string, String target) {
        if(my_string.contains(target)) {
            return 1;  //answer을 선언하지 않고도 정답 출력 가능
        } else {
            return 0;
        }
    }
}
