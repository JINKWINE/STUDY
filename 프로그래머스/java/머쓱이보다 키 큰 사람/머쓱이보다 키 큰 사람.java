class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > height){ //height가 array의 '요소'보다 클 때
                answer++; //answer의 정수 증가
            }
        }
        return answer;
    }
}
