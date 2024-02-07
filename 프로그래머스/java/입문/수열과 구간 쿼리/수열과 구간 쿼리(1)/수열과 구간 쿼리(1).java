class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int[] currentQuery : queries) { //쿼리를 순환하면서
            int start = currentQuery[0]; //첫 번째 배열 첫 번째 원소를 start
            int end = currentQuery[1]; //첫 번째 배열 두 번째 원소를 end라고 정의
            
            for(int i = start; i <= end; i++) { //주어진 배열의 처음부터 끝까지 순환하면서
                
                arr[i] += 1; //배열의 원소값이 일치하면 1을 더한다
            }
        }
        
        return arr;
    }
}
