class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int even = 0;
        int odd = 0;
        
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] % 2 == 0){
                even++; //짝수 찾을 때마다 1씩 증가
            }else{
                odd++;
            }
        }
        
        answer[0] = even;
        answer[1] = odd;
        return answer;
    }
}
