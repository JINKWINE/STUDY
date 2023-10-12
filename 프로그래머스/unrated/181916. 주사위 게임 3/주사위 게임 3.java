import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        
        int diceRoll[] = {a, b, c, d};
        
        Arrays.sort(diceRoll);
        int q = diceRoll[0];
        int w = diceRoll[1];
        int e = diceRoll[2];
        int r = diceRoll[3];
        
        if(q == w) {
            if(w == e) {
                if(e == r) {
                    answer = 1111 * q;
                } else {
                    answer = (10 * q + r) * (10 * q + r);
                }
            } else if(e == r) {
                answer = (q + e) * (e - q);
            } else answer = e * r;
            
        } else if(w == e) {
            if(e == r) {
                answer = (10 * w + q) * (10 * w + q);
            } else answer = q * r;
        } else if(e == r) {
            answer = q * w;
        } else answer = q;
        
        return answer;
    }
}