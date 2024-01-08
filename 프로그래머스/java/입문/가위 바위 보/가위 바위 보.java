class Solution {
    public String solution(String rsp) {
        String answer = "";
        for(int i = 0; i < rsp.length(); i++){
            char player = rsp.charAt(i);
            
            if(player == '2'){
                answer += '0'; 
            }else if(player == '0'){
                answer += '5';
            }else if(player == '5'){
                answer += '2';
            }
        }
        return answer;
    }
}
