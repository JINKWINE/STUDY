class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int longest = sides[0];
        int secondLong = sides[1];
        int shortest = sides[2];
        
        for(int i = 0; i < sides.length; i++) {
            if(sides[i] > longest) {
                shortest = secondLong;
                secondLong = longest;
                longest = sides[i];
            } else if(sides[i] > secondLong) {
                shortest = secondLong;
                secondLong = sides[i];
            } else {
                shortest = sides[i];
            }
        }
        
        if(longest < secondLong + shortest) {
            answer = 1;
        } else {
            answer = 2;
        }
        
        return answer;
    }
}
