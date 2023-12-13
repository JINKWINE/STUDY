class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String plus = "" + a + b;
        int twice = a * b *2;
        if(Integer.valueOf(plus) > twice){
            answer = Integer.valueOf(plus);
        }else{
            answer = twice;
        }
        return answer;
    }
}
