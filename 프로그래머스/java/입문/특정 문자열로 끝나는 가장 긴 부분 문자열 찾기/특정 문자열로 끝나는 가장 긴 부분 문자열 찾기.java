class Solution {
    public String solution(String myString, String pat) {
        int count = pat.length();
        int index = 0;
        String answer = "";
        index = myString.lastIndexOf(pat);
        answer = myString.substring(0, index + count);
        return answer;
    }
}
