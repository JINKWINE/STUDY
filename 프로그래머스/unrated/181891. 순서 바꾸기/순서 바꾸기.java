import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int[] front = Arrays.copyOfRange(num_list, 0, n);
        int[] rear = Arrays.copyOfRange(num_list, n, num_list.length);

        // System.arraycopy 메소드 front 배열을 answer에 복사
        System.arraycopy(rear, 0, answer, 0, rear.length);

        // rear 배열을 answer에 이어붙임
        System.arraycopy(front, 0, answer, rear.length, front.length);

        return answer;
    }
}
