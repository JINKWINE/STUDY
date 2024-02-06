class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int[] currentQuery : queries) {
            int start = currentQuery[0];
            int end = currentQuery[1];
            
            for(int i = start; i <= end; i++) {
                
                arr[i] += 1;
            }
        }
        
        return arr;
    }
}
