class Solution {
    public int[] solution(int[] num_list) {
        int[] reverse = new int[num_list.length]; //num_list 길이의 배열 reverse 생성
        for(int i=0; i<=num_list.length-1; i++) {
            reverse[i] = num_list[num_list.length-i-1]; //reverse 배열 위치에 num_list의 길이에서 reverse의 원소+1만큼을 차감한 위치의 원소를 치환 
        }
        return reverse;
    }
}
