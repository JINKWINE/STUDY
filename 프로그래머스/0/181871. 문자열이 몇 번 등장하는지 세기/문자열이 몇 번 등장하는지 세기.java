class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int patLeng = pat.length();
        int strLeng = myString.length();
        
        for (int i = 0; i <= strLeng - patLeng; i++) {
            boolean match = true;
            for (int j = 0; j < patLeng; j++) {
                if (myString.charAt(i + j) != pat.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                answer++;
            }
        }
        
        return answer;
    }
}
