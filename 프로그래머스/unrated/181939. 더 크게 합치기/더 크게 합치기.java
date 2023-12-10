class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String strA = Integer.toString(a);
        String strB = Integer.toString(b);
        String ab = strA + strB;
        String ba = strB + strA;
        
        int numAB = Integer.valueOf(ab);
        int numBA = Integer.valueOf(ba);
        
 
        if (numAB > numBA) {
            answer = numAB;
        } else {
            answer = numBA;
        }
        
        return answer;
        
    }
    
}