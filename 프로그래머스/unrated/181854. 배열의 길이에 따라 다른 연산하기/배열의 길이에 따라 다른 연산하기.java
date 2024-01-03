class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length]; 
        if(arr.length % 2 == 0){
            for(int i = 0; i < arr.length; i++){
                for(int j = 1; j < arr.length; j+=2){
                    answer[i] = arr[i];
                    answer[j] = arr[j] + n;
                }
            }
        }else{
            for(int i = 0; i < arr.length; i++){
                for(int j = 0; j < arr.length; j+=2){
                    answer[i] = arr[i];
                    answer[j] = arr[j] + n;
                    
                }
                
            }
        }
        return answer;
    }
}