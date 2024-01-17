class Solution {
    public int solution(int[] arr, int idx) {
        int answer = 0;
        for(int i = 0; i < arr.length; i++){
            if(i > idx && arr[i] == 1){
                answer = i;
                break;
                
            }else if(i == idx && arr[i] == 1){
                answer = idx;
                break;
                
            }else if(i == idx && arr[i] == 0){
                answer = -1;
            }else if(i > idx && arr[i] == 0){
                answer = -1;
            }
        }
        return answer;
    }
}