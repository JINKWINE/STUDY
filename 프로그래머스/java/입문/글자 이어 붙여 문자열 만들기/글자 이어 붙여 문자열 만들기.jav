class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        int idx = 0;
        for(int i = 0; i < index_list.length; i++){
            
            idx = index_list[i];
            
            answer += my_string.charAt(idx);
            
        }

        return answer;
    }
}
