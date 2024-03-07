import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int[] stk = {}; //배열 생성
        int index = 0; //stk의 인덱스
        for(int i = 0;  i < arr.length;) { //배열 arr만큼 반복
            if(stk.length == 0) { //stk이 비어있을 때
                stk = new int[1]; //길이를 1로 초기화
                stk[index++] = arr[i]; //stk에 arr의 첫번째 원소 할당
                i++; //arr의 인덱스 증가
            } else {
                if(stk[stk.length-1] < arr[i]) { //stk의 마지막 원소가 arr의 원소보다 작으면
                    stk = Arrays.copyOf(stk, stk.length+1); //stk을 그대로 복사후 길이를 늘림
                    stk[stk.length-1] = arr[i]; //마지막에 arr원소 추가
                    i++; //스택의 인덱스 증가
                } else { //stk의 마지막 원소가 arr의 원소보다 크거나 같으면
                    stk = Arrays.copyOf(stk, stk.length-1); //stk을 그대로 복사후 길이를 줄임
                    index--; //스택의 현재 인덱스 감소
                    if(index < 0) {
                        index = 0; //인덱스가 0이 되지 않도록 조정
                    }
                }
            }
        }
        return stk;
    }
}
