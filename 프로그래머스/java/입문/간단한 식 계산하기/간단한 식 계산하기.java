class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] spNum = binomial.split(" ");
        
        if(spNum[1].equals("+")){
            answer = Integer.parseInt(spNum[0]) + Integer.parseInt(spNum[2]);
        }else if(spNum[1].equals("-")){
            answer = Integer.parseInt(spNum[0]) - Integer.parseInt(spNum[2]);
        }else if(spNum[1].equals("*")){
            answer = Integer.parseInt(spNum[0]) * Integer.parseInt(spNum[2]);
        }
        
        return answer;
    }
}
