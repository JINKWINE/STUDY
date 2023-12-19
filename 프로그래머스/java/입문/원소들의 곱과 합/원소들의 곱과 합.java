class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int multi = 1;
        int sum = 0;
        double pow = 0;
        for(int i = 0; i < num_list.length; i++){
            multi *= num_list[i];
        }
        
        for(int j = 0; j < num_list.length; j++){
            sum += num_list[j];
            pow = Math.pow(sum, 2);
        }
        
        if(multi < pow){
            answer = 1;
            
        }else if(multi > pow){
            answer = 0;
        }
        
        return answer;
    }
}
