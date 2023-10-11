class Solution {
    public int solution(int n) {
        int answer = 0;
        
        while(n != 0){
            answer += n % 10; //정수를 10으로 나눈 나머지의 합을 누계
            n /= 10; //정수를 10으로 나눈 몫
        }
            return answer;
    }
}
