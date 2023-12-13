class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String plus = "" + a + b;
        int multi = a * b *2;
        if(Integer.valueOf(plus) > multi){
            answer = Integer.valueOf(plus);
        }else{
            answer = multi;
        }
        return answer;
    }
}