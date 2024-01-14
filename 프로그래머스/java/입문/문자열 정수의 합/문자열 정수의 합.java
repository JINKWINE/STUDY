class Solution {
    public int solution(String num_str) {
        int answer = 0;
        int[] intArray = new int[num_str.length()];
        
        for(int i = 0; i < num_str.length(); i++){
            intArray[i] = num_str.charAt(i)-'0'; //문자 0의 ASCII값 48 차감
        }
        
        for(int i = 0; i < intArray.length; i++){
            answer += intArray[i];
        }
        return answer;
    }
}
