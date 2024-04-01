class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int [arr.length];
        for(int i = 0; i<arr.length; i++){
            if(k%2 == 0){
                answer[i] = arr[i] + k;
            }else {
                answer[i] = arr[i] * k;
            }
        }
        return answer;
    }
}



-- 작성했던 오답--
class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = {};
        for(int i = 0; i<length.arr; i++){
            if(k%2 == 0){
                arr[i] = arr[i + k];   //원소 배열 순번에 정수 k를 연산하면서 잘못된 배열 결과를 출력함과 동시에 답이 아닌 다른 배열을 초기화 하고 있음
            }else{
                arr[i] = arr[i * k];
            }
        }
        return answer;
    }
}
