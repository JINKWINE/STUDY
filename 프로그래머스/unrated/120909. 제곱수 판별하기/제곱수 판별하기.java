class Solution {
    public int solution(int n) {
        int answer = 0;
        int r = (int) Math.sqrt(n);  //n의 제곱근 설정

        if (r * r == n) {
            answer = 1;  
        } else {
            answer = 2; 
        }

        return answer;
    }
}
