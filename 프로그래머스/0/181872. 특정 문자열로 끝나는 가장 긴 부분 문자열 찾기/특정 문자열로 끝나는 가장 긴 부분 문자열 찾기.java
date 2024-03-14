class Solution {
    public String solution(String myString, String pat) {
        // pat의 문자열 길이를 구한다.
        int patLeng = pat.length();
        
        // myString에서 pat이 가장 마지막으로 등장하는 인덱스를 구한다.
        int lastIndex = myString.lastIndexOf(pat);
        
        // myString을 처음부터 patLeng의 길이를 더한만큼의 인덱스까지 자른다.
        String answer = myString.substring(0, lastIndex + patLeng);
        
        return answer;
    }
}
