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


//더 깔끔한 풀이
class Solution {
    public int solution(int n) {
        if (n % Math.sqrt(n) == 0) { //자연수를 자연수의 제곱근으로 나눈 나머지가 0
            return 1;
        } else {
            return 2;
        }
    }
}
