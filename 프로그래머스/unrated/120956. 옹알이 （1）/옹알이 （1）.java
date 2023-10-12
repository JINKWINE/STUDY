class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        int arraylen = 0;
        
        String[] babb = {"aya", "ye", "woo", "ma"};
        // 주어진 babbling에 문자열의 길이 카운트.
        // babbling[0] ~ 배열 길이까지 저장된 문자에 해당하는 문자가 있는지 판별.
        // 해당하면 그 다음 문자열도 읽고 해당 단어가 존재하는지 판별하고 개수를 카운트한다.
            
        for (int i =0; i < babbling.length; i++) {
            arraylen = babbling[i].length();
            for (int j =0; j < babb.length; j++) {
                if(babbling[i].contains(babb[j])) {
                  arraylen -= babb[j].length();
                }
            }
            if (arraylen ==0) {
                answer++;
            }   
        }
        
        
        return answer;
    }
}