class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        myString = myString.replace("A", "tmp");
        myString = myString.replace("B", "A");
        myString = myString.replace("tmp", "B");
        if(myString.contains(pat)){
            answer = 1;
    
        }else{
            answer = 0;
        }
        return answer;
    }
}
