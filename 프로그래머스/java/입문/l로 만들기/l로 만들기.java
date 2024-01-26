class Solution {
    public String solution(String myString){
        StringBuilder answer = new StringBuilder();

        for(int i = 0; i < myString.length(); i++){
            char current = myString.charAt(i);

            if((int) current < 108){
                answer.append("l");
            }else{
                answer.append(current);
            }
        }

        return answer.toString();
    }
}
