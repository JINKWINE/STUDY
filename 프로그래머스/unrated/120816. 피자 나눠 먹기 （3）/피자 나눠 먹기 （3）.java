class Solution {
    public int solution(int slice, int n) {
        double answer = 0;
        answer = Math.ceil((double)n/(double)slice);
        return (int)answer;
    }
}
