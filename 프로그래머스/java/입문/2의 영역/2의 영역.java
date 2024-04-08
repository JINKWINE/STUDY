class Solution {
    public int[] solution(int[] arr) {
        int start = -1;
        int end = 0;
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 2) {
                start = i;
                break;
            }
        }
        
        if(start != -1) {
            for(int i = start; i < arr.length; i++) {
                if(arr[i] == 2) {
                    end = i;
                }
            }
        }
        
        if(start != -1) {
            int[] answer = new int [end - start + 1];
            for(int i = 0; i < answer.length; i++) {
                answer[i] = arr[i + start];
            }
            
            return answer;
            
        } else {
            return new int[]{-1};   
        }
        
    }
}
