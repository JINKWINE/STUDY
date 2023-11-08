import java.lang.Math;

class Solution {
    public int solution(int n, int t) {
        double answer = 0;
        for(int i = 0; i <= t; i++){
            answer = n*(Math.pow(2, t));
        }
        return (int)answer;
    }
}