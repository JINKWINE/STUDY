import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries){
        int[] answer = new int[queries.length];

        for(int i = 0; i < queries.length; i++){
           int start = queries[i][0]; //queries의 i행 1열을 start로 설정(배열의 시작 범위)
           int end = queries[i][1]; //queries의 i행 2열을 end로 설정(배열의 끝 범위)
           int comparison = queries[i][2]; //queries의 i행 3열을 comparison으로 설정(비교 값)

           int minRange = Integer.MAX_VALUE; //최솟값을 담는 변수 설정

           for(int j = start; j <= end; j++){
                if(arr[j] > comparison && arr[j] < minRange){ //배열 arr를 순환하면서 비교값(comparison)보다 크고 그 중에서 가장 작은 값 찾기
                    minRange = arr[j]; //최솟값에 값 저장
                }
           }

           if(minRange == Integer.MAX_VALUE){ //최솟값이 처음 설정값과 같다면(범위에서 어떤 값도 찾아내지 못한다면)
               answer[i] = -1; //-1저장
           }else{
               answer[i] = minRange; //최솟값 저장
           }
            
        }

        return answer;
    }
}
