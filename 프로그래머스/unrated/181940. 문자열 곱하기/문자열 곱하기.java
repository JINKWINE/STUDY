class Solution {
    public String solution(String my_string, int k) {
        String answer = "";
        for(int i = 0; i < my_string.length(); i++){
            answer = my_string.repeat(k);
        }
        return answer;
    }
}